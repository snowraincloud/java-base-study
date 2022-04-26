package priv.wjh.concurrent.knowledge.threadobjectclasscommonmethods;

import java.util.concurrent.TimeUnit;

/**
 * <h1>The demo join method was interrupted</h1>
 *
 * @author wangjunhao
 **/
public class JoinInterrupt {
    public static void main(String[] args) {
        var main = Thread.currentThread();
        var t = new Thread(() -> {
            main.interrupt();
            System.out.println("interrupt main thread");
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("The child thread has awakened");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("The child thread was interrupted");
            }
            System.out.println("The child thread finished");
        });
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("The " + Thread.currentThread().getName() + " thread was interrupted" );
            t.interrupt();
            System.out.println("interrupt child thread");
        }
        System.out.println("All child threads have completed execution");
    }
}
