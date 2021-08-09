package creational.singleton;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * <h1>单例模式的实现4</h1>
 * <p>
 * 类加载时没有生成单例，只有当第一次获取实例时才去创建这个单例
 * 优点：使用时候创建，可能节约内存。
 * </p>
 * @author wangjunhao
 **/
@ThreadSafe
public class SingletonFour implements ISingleton{
    /**
     * <p>静态对象，储存当前类的唯一实例</p>
     */
    @GuardedBy("SingletonFour")
    private static volatile SingletonFour instance = null;

    /**
     * <p>私有化构造函数，避免外部创建实例</p>
     */
    private SingletonFour(){
        System.out.println("SingletonFour()");

    }

    /**
     * <p>
     * 双检锁方式实现的线程安全
     * 缺点：DCL失效，由于instance = new SingleFour();虽然是一条语句，但是却不是原子操作。实例化对象的汇编指令大致有三件事
     *
     * 1、给instance分配内存
     * 2、调用new SingleFour()初始化函数
     * 3、将分配的内存空间地址赋值给instance
     *
     * 在jdk1.5之前执行顺序可能是1-2-3，或者1-3-2，如果是1-3-2，可能比得线程拿到的就是一个内存地址而instance没有调用初始化方法new SingleFour()，
     *
     * jdk1.5之后修复，加入关键字volatile，避免以上错误，所以确保DCL正确性，给变量加上这个属性
     * </p>
     * @return
     */
    public static SingletonFour getInstance(){
        if (instance == null){
            synchronized (SingletonFour.class){
                if (instance == null){
                    instance = new SingletonFour();
                }
            }
        }
        return instance;
    }
}
