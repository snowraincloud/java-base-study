package priv.wjh.concurrent.knowledge.jmm;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * <h1>Demonstrate the reordering problem</h1>
 *
 * @author wangjunhao
 **/
public class OutOfOrderExecution {
    private static int a;
    private static int b;
    private static int x;
    private static int y;

//    private static CountDownLatch latch = new CountDownLatch(1);
    private static CyclicBarrier barrier = new CyclicBarrier(2);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0;; i++) {
            a = 0;
            b = 0;
            x = 0;
            y = 0;

            barrier.reset();
            var t1 = new Thread(() -> {
                try {
//                    latch.await();
                    barrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
                a = 1;
                x = b;
            });
            var t2 = new Thread(() -> {
                try {
//                    latch.await();
                    barrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
                b = 1;
                y = a;
            });

            t1.start();
            t2.start();

//            latch.countDown();
            t1.join();
            t2.join();

            String result =i + ": " +  "(x = " + x + ", y = " + y + ")";
            if (x == 0 && y == 0){
                System.out.println("---" + result);
                break;
            }else {
                System.out.println(result);
            }


        }

    }
}
