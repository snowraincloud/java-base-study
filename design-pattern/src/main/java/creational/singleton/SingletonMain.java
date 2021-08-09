package creational.singleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;

/**
 * <h1>单例模式</h1>
 * <p>
 * 一个类只有一个实例，且该类能自行创建这个实例的一种模式
 * 能够避免对象重复创建，节约空间并提升效率
 * 推荐使用 1、5、6 实现单例
 * </p>
 * <p>单例模式有三个特点:</p>
 * <ol>
 *     <li>单例类只有一个实例对象</li>
 *     <li>该单例对象必须由单例类自行创建</li>
 *     <li>单例类对外提供一个访问该单例的全局访问点</li>
 * </ol>
 * @author wangjunhao
 **/
public class SingletonMain {


    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            // 创建线程 获取单例
            new Thread(SingletonMain::get).start();
        }

    }
    private static final Class<?>[] CLASSES = {
            SingletonOne.class,
            SingletonTwo.class,
            SingletonThree.class,
            SingletonFour.class,
            SingletonFive.class,
            SingletonSix.class
    };

    private static final Random RAND = new Random(47);

    public static ISingleton get() {
        Method method = null;
        try {
            method = CLASSES[RAND.nextInt(CLASSES.length)].getMethod("getInstance");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        try {
            return (ISingleton) method.invoke(null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
