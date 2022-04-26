package structural.proxy;

/**
 * <h1>计时代理</h1>
 *
 * @author wangjunhao
 **/
public class TimerProxy extends AbstractProxy{
    public TimerProxy(Subject subject) {
        super(subject);
    }

    @Override
    public void process() throws InterruptedException {
        long cur = System.currentTimeMillis();
        super.process();
        System.out.println("用时: " + (System.currentTimeMillis() - cur));
    }
}
