package priv.wjh.concurrent.knowledge.startthread;

/**
 * <h1>start方法与run方法 运行比较</h1>
 *
 * @author wangjunhao
 **/
public class CompareStartAndRunMethod {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());
        };
        runnable.run();
        new Thread(runnable).start();
    }
}
