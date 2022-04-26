package structural.proxy;

/**
 * <h1>代理模式</h1>
 * <p>能够提供对象的替代品或其占位符。 代理控制着对于原对象的访问， 并允许在将请求提交给对象前后进行一些处理。</p>
 * <p>代理模式的主要角色如下。</p>
 * <ol>
 * 	<li>
 * 		抽象主题（Subject）类：通过接口或抽象类声明真实主题和代理对象实现的业务方法。</li>
 * 	<li>
 * 		真实主题（Real Subject）类：实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象。</li>
 * 	<li>
 * 		代理（Proxy）类：提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。</li>
 * </ol>
 * @author wangjunhao
 **/
public class ProxyTest {
    public static void main(String[] args) throws InterruptedException {
        Subject subject = new SubjectImpl();
        subject.process();
        System.out.println();
        LogProxy logProxy = new LogProxy(subject);
        logProxy.process();
        System.out.println();
        TimerProxy timerProxy = new TimerProxy(logProxy);
        timerProxy.process();
    }
}
