package priv.wjh.concurrent.knowledge.sixstatus;

/**
 * <h1>展示线程的三种状态</h1>
 * <p>New Runnable Terminated</p>
 * @author wangjunhao
 **/
public class NewRunnableTerminated implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        var t = new Thread(new NewRunnableTerminated());
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        Thread.sleep(10);
        System.out.println(t.getState());
        Thread.sleep(1000);
        System.out.println(t.getState());
    }
}
