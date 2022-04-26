package priv.wjh.concurrent.knowledge.createthreads;

/**
 * <h1>实现Runnable接口创建线程</h1>
 *
 * @author wangjunhao
 **/
public class RunnableStyle implements Runnable{
    public static void main(String[] args) {
        var thread = new Thread(new RunnableStyle());
        thread.start();
    }
    @Override
    public void run() {
        System.out.println("实现Runnable接口创建线程");
    }
}
