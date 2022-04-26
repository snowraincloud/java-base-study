package priv.wjh.concurrent.knowledge.stopthreads;

/**
 * <h1>在while中放try、catch，会导致中断失效</h1>
 *
 * @author wangjunhao
 **/
public class CantInterrupt implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i < 10000 && !Thread.currentThread().isInterrupted()){
            if (i % 100 == 0){
                System.out.println(i);
            }
            i++;
            try {
                // 响应中断后会清除中断标记位
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        var t = new Thread(new CantInterrupt());
        t.start();
        Thread.sleep(5000);
        t.interrupt();
    }
}
