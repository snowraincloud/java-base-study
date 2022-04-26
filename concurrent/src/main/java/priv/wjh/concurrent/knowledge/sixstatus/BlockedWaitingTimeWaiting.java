package priv.wjh.concurrent.knowledge.sixstatus;

/**
 * <h1>展示Blocked、Waiting、TimeWaiting</h1>
 *
 * @author wangjunhao
 **/
public class BlockedWaitingTimeWaiting implements Runnable{
    @Override
    public void run() {
        sync();
    }

    private synchronized void sync() {
        try {
            Thread.sleep(1000);
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        var runnable = new BlockedWaitingTimeWaiting();
        var t1 = new Thread(runnable);
        var t2 = new Thread(runnable);
        t1.start();
        t2.start();
        Thread.sleep(100);
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        Thread.sleep(1000);
        System.out.println(t1.getState());
    }
}
