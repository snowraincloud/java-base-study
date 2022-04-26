package creational.singleton;

import net.jcip.annotations.NotThreadSafe;

/**
 * <h1>单例模式的实现2</h1>
 * <pre>
 * 类加载时没有生成单例，只有当第一次获取实例时才去创建这个单例
 * 优点：使用时候创建，可能节约内存。
 * 缺点：不是线程安全
 * </pre>
 *
 * @author wangjunhao
 **/
@NotThreadSafe
public class SingletonTwo implements ISingleton{
    /**
     * <p>静态对象，储存当前类的唯一实例</p>
     */
    private static SingletonTwo instance = null;

    /**
     * <p>私有化构造函数，避免外部创建实例</p>
     */
    private SingletonTwo(){
        System.out.println("SingletonTwo()");

    }

    public static SingletonTwo getInstance(){
        if (instance == null){
            instance = new SingletonTwo();
        }
        return instance;
    }
}
