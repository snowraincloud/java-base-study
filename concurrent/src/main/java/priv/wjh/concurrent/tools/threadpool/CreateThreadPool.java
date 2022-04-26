package priv.wjh.concurrent.tools.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
public class CreateThreadPool {

    public static void main(String[] args) throws InterruptedException {
        var pool = new ThreadPoolExecutor(1, 5, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            pool.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " execute " + finalI);
            });
        }
        Thread.sleep(1000);
        pool.shutdown();


    }
    
}
