package priv.wjh.study.concurrent.use;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;


class TokenBucketTest {
    private static final Logger logger = LoggerFactory.getLogger(TokenBucketTest.class);
    volatile int count = 4;

    @Test
    public void test() throws InterruptedException {
        TokenBucket tokenBucket = new TokenBucket();
        final int len = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Thread[] threads = new Thread[len];
        for (int i = 1; i < len; i++) {
            int finalI = i;
            threads[finalI] = new Thread(() -> {

                logger.info(() -> finalI + "Request five token");
                try {
                    tokenBucket.useToken(5);
                    count--;
                    logger.info(() -> "Used 5 token");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            threads[finalI].start();
        }


        for (int i = 1; i < 21; i++) {
            final int i1 = i;
            executorService.submit(() -> {
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                tokenBucket.putToken(1);
                logger.info(() -> "thread " + i1 + " put 1 token");
            });
        }

        for (int i = 1; i < len; i++) {
           threads[i].join();
        }
        assertEquals(0, tokenBucket.getTokenCount());
        assertEquals(0, count);
    }

}