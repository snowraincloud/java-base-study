package creational.singleton;

/**
 * <h1>单例模式的实现4</h1>
 * <p>
 * 由于枚举本来就是实例数量已知且固定的，所以如果枚举类只有一个实例，也就实现了单例。
 * 而且不用考虑被反射和反序列化 而被克隆，任何情况下都是单例的
 * </p>
 * @author wangjunhao
 **/
public enum SingletonSix implements ISingleton{

    INSTANCE;
    SingletonSix(){
        System.out.println("SingletonSix()");
    }
    public static SingletonSix getInstance(){
        return INSTANCE;
    }
}
