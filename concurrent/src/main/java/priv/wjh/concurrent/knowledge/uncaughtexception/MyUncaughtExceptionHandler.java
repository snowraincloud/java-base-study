package priv.wjh.concurrent.knowledge.uncaughtexception;

/**
 * <h1>自定义 未捕获异常处理器</h1>
 *
 * @author wangjunhao
 **/
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    private final String name;

    public MyUncaughtExceptionHandler(String name) {
        this.name = name;
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(name + " caught an exception from " + t.getName());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler("my uncaught exception handler"));

        new Thread(new CantCatchDirectly(), "my-thread-1").start();
        Thread.sleep(300);
        new Thread(new CantCatchDirectly(), "my-thread-2").start();
        Thread.sleep(300);
        new Thread(new CantCatchDirectly(), "my-thread-3").start();
        Thread.sleep(300);
        new Thread(new CantCatchDirectly(), "my-thread-4").start();
        Thread.sleep(300);
    }
}
