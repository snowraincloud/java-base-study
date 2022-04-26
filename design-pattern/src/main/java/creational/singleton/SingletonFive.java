package creational.singleton;


import net.jcip.annotations.ThreadSafe;

/**
 * <h1>单例模式的实现4</h1>
 * <pre>
 * 静态内部类的懒加载
 * 在加载类SingletonFive的时候，不会初始化instance。
 * 调用getInstance()才会加载SingletonFiveHolder类，
 * 线程安全，没有内存浪费，不用锁。推荐使用。
 * </pre>
 *
 * @author wangjunhao
 **/
@ThreadSafe
public class SingletonFive implements ISingleton{
    /**
     * <p>
     * 静态内部类，只有第一次使用内部类时才会加载内部类进性初始化
     * 静态域在类的第一次加载时初始化
     * 当访问一个类的静态域时，如果该类尚未初始化，则立即初始化此类
     * </p>
     */
    private static class SingletonFiveHolder{
        private static final SingletonFive instance = new SingletonFive();
    }

    private SingletonFive(){
        System.out.println("SingletonFive()");

    }

    public static SingletonFive getInstance(){
        return SingletonFiveHolder.instance;
    }
}
