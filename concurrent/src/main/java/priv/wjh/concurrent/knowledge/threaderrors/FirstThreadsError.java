package priv.wjh.concurrent.knowledge.threaderrors;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <h1>Error in run result</h1>
 *
 * @author wangjunhao
 **/
public class FirstThreadsError implements Runnable{
    private static int count = 0;
    private static boolean[] mark = new boolean[20001];

    private static AtomicInteger realIndex = new AtomicInteger();
    private static AtomicInteger wrongCount = new AtomicInteger();

    private static CyclicBarrier cyclicBarrier1 = new CyclicBarrier(2);
    private static CyclicBarrier cyclicBarrier2 = new CyclicBarrier(2);

    static final FirstThreadsError INSTANCE = new FirstThreadsError();

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            cyclicBarrier2.reset();
            try {
                cyclicBarrier1.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            count++;
            cyclicBarrier1.reset();
            try {
                cyclicBarrier2.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            realIndex.getAndIncrement();
            synchronized (this){
                if (mark[count] && mark[count - 1 ]){
                    System.out.println("An error occurred: " + count);
                    wrongCount.incrementAndGet();
                }
                mark[count] = true;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(INSTANCE);
        var t2 = new Thread(new FirstThreadsError());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Numerical result: " + count);
        System.out.println("Real index: " + realIndex.get());
        System.out.println("Wrong count: " + wrongCount.get());
        System.out.println("Program execution completed");
    }
}
