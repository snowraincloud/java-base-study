package structural.proxy;

/**
 * <h1>日志代理</h1>
 *
 * @author wangjunhao
 **/
public class LogProxy extends AbstractProxy{

    public LogProxy(Subject subject) {
        super(subject);
    }

    @Override
    public void process() throws InterruptedException {
        System.out.println("开始执行");
        super.process();
        System.out.println("结束执行");
    }
}
