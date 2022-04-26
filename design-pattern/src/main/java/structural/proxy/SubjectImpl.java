package structural.proxy;

/**
 * <h1>具体主题</h1>
 *
 * @author wangjunhao
 **/
public class SubjectImpl implements Subject{
    @Override
    public void process() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("执行完成");
    }
}
