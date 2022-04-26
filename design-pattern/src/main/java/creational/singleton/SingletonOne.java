package creational.singleton;

import net.jcip.annotations.ThreadSafe;

/**
 * <h1>单例模式的实现1</h1>
 * <pre>
 *  类一旦加载就创建一个单例，保证在调用获取实例之前 单例已经存在了
 *
 *  优点：不存在线程安全问题，不存在同步sync性能问题。
 *  缺点：由于在声明的时候已经初始化，即使该类没有使用也会占用内存。
 * </pre>
 * @author wangjunhao
 **/
@ThreadSafe
public class SingletonOne implements ISingleton{

    /**
     * <p>静态常量对象，储存当前类的唯一实例</p>
     */
    private static final SingletonOne INSTANCE = new SingletonOne();

    /**
     * <p>私有化构造函数，避免外部创建实例</p>
     */
    private SingletonOne(){
        System.out.println("SingletonOne()");
    }

    /**
     * @return 当前类的唯一实例
     */
    public static SingletonOne getInstance(){
        return INSTANCE;
    }
}
