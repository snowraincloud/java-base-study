package priv.wjh.concurrent.knowledge.stopthreads;

/**
 * <h1>中断有阻塞的线程</h1>
 *
 * @author wangjunhao
 **/
public class RightWayStopThreadWithSleep implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            if (i % 100 == 0){
                System.out.println(i);
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        var thread = new Thread(new RightWayStopThreadWithSleep());
        thread.start();
        Thread.sleep(500);
        thread.interrupt();
    }
}
