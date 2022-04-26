package priv.wjh.concurrent.knowledge.uncaughtexception;

/**
 * <h1>无法直接捕获子线程异常,且子线程异常不影响主线程执行</h1>
 *
 * @author wangjunhao
 **/
public class CantCatchDirectly implements Runnable{
    @Override
    public void run() {
        throw new RuntimeException();
    }

    public static void main(String[] args) throws InterruptedException {
        try {
            new Thread(new CantCatchDirectly(), "my-thread-1").start();
            Thread.sleep(300);
            new Thread(new CantCatchDirectly(), "my-thread-2").start();
            Thread.sleep(300);
            new Thread(new CantCatchDirectly(), "my-thread-3").start();
            Thread.sleep(300);
            new Thread(new CantCatchDirectly(), "my-thread-4").start();
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Caught Exception");
        }
    }
}
