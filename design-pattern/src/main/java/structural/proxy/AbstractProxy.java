package structural.proxy;

/**
 * <h1>抽象代理</h1>
 * @author wangjunhao
 **/
public abstract class AbstractProxy implements Subject{
    private Subject subject;

    public AbstractProxy(Subject subject) {
        this.subject = subject;
    }
    @Override
    public void process() throws InterruptedException {
        subject.process();
    }
}
