package priv.wjh.concurrent.knowledge.threadobjectclasscommonmethods;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * <h1>演示sleep 被中断</h1>
 *
 * @author wangjunhao
 **/
public class SleepInterrupt implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(new Date());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("The current thread was interrupted");
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        var t = new Thread(new SleepInterrupt());
        t.start();
        TimeUnit.SECONDS.sleep(5);
        t.interrupt();
    }
}
