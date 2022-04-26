package priv.wjh.concurrent.knowledge.stopthreads;

/**
 * <h1>run方法内没有sleep方法和wait方法时，停止线程</h1>
 *
 * @author wangjunhao
 **/
public class RightWayStopThreadWithoutSleep implements Runnable{
    @Override
    public void run() {
        for (int i = 0; !Thread.currentThread().isInterrupted() && i < Integer.MAX_VALUE / 2; i++) {
            if (i % 10000 == 0){
                System.out.println(i);
            }
        }
        System.out.println("--------");
    }

    public static void main(String[] args) throws InterruptedException {
        var thread = new Thread(new RightWayStopThreadWithoutSleep());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
