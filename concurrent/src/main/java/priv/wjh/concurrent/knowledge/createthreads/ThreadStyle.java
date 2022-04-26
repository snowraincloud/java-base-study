package priv.wjh.concurrent.knowledge.createthreads;

/**
 * <h1>继承thread类 创建线程</h1>
 *
 * @author wangjunhao
 **/
public class ThreadStyle extends Thread {
    public static void main(String[] args) {
        var thread = new ThreadStyle();
        thread.run();
    }
    @Override
    public void run() {
        System.out.println("继承thread类 创建线程");
    }
}
