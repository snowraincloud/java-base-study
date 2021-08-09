package creational.singleton;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * <h1>单例模式的实现3</h1>
 * <p>
 * 类加载时没有生成单例，只有当第一次获取实例时才去创建这个单例
 * 优点：使用时候创建，可能节约内存。
 * 缺点：每次都要锁住方法，即使instance已经被初始化，导致效率较低。
 * </p>
 * @author wangjunhao
 **/
@ThreadSafe
public class SingletonThree implements ISingleton{
    /**
     * <p>静态对象，储存当前类的唯一实例</p>
     */
    @GuardedBy("SingletonThree")
    private static SingletonThree instance = null;

    /**
     * <p>私有化构造函数，避免外部创建实例</p>
     */
    private SingletonThree(){
        System.out.println("SingletonThree()");

    }

    /**
     * <p>
     * 在方法上添加同步锁 实现线程安全
     * </p>
     */
    public static synchronized SingletonThree getInstance(){
        if (instance == null){
            instance = new SingletonThree();
        }
        return instance;
    }



}
