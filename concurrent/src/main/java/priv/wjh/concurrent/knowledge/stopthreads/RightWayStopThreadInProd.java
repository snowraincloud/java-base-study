package priv.wjh.concurrent.knowledge.stopthreads;

/**
 * <h1>最佳实践</h1>
 * @author wangjunhao
 **/
public class RightWayStopThreadInProd{

    /**
     * <h2>传递中断</h2>
     * @throws InterruptedException
     */
    public static void throwInMethod() throws InterruptedException {
        Thread.sleep(1000);
    }

    /**
     * <h2>恢复中断</h2>
     */
    public static void  reInterrupt(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // 恢复中断
            Thread.currentThread().interrupt();
            e.printStackTrace();

        }
    }

    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(() -> {
            while (true && ! Thread.currentThread().isInterrupted()){
                System.out.println("t1");
                try {
                    throwInMethod();
                } catch (InterruptedException e) {
                    System.out.println("捕获异常");
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        });
        t1.start();
        Thread.sleep(1000);
        t1.interrupt();
        var t2 = new Thread(() -> {
            while (true && ! Thread.currentThread().isInterrupted()){
                System.out.println("t2");
                reInterrupt();
            }
        });
        t2.start();
        Thread.sleep(1000);
        t2.interrupt();
    }
}
