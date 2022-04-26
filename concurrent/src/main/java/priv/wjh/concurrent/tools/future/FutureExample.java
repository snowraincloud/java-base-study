package priv.wjh.concurrent.tools.future;

import java.util.Random;
import java.util.RandomAccess;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * <h1>An example used by Future</h1>
 *
 * @author wangjunhao
 **/
public class FutureExample {


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Long> future = executorService.submit(() -> {
                Thread.sleep(3000);
            return new Random().nextLong();
        });

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        future = executorService.submit(() -> {
            throw new RuntimeException(Thread.currentThread().getName());
        });
        try {
            future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
