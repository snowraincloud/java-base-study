package priv.wjh.concurrent.knowledge.threadobjectclasscommonmethods;

/**
 * <h1>两个线程交替打印0~100的奇偶数</h1>
 *
 * @author wangjunhao
 **/
public class WaitNotifyPrintOddEvenSync {
    static final Object PRINT = new Object();

    static class EvenThread extends Thread{
        @Override
        public void run() {
            synchronized (PRINT){
                for (int i = 0; i < 100; i+=2) {
                    PRINT.notify();
                    System.out.println(getName() + ": " + i);
                    try {
                        PRINT.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }

    static class OddThread extends Thread{
        @Override
        public void run() {
            synchronized (PRINT){
                for (int i = 1; i < 100; i+=2) {
                    try {
                        PRINT.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + ": " + i);
                    PRINT.notify();
                }
            }
        }
    }

    static int count = 0;
    static class TurningRunner implements Runnable{
        @Override
        public void run() {
            while (count <= 100){
                synchronized (PRINT){
                    System.out.println(Thread.currentThread().getName() + ": " + count++);
                    PRINT.notify();
                    if (count <= 100){
                        try {
                            PRINT.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        var t1 = new EvenThread();
        var t2 = new OddThread();
        t2.start();
        Thread.sleep(100);
        t1.start();

        t1.join();
//        synchronized (t1){
//            t1.wait();
//        }
        System.out.println("-----------");

        var r1 = new Thread(new TurningRunner(), "偶");
        var r2 = new Thread(new TurningRunner(), "奇");
        r1.start();
        r2.start();

    }
}
