package creational.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * <h1>原型模式</h1>
 * <p>
 *     <b>用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象</b><br>
 *
 *     使用原型模式复制对象不会调用类的构造方法。因为对象的复制是通过调用Object类的clone方法来完成的，
 *     它直接在内存中复制数据，因此不会调用到类的构造方法。<br>
 *     不但构造方法中的代码不会执行，甚至连访问权限都对原型模式无效。<br>
 *     还记得单例模式吗？单例模式中，只要将构造方法的访问权限设置为private型，就可以实现单例。
 *     但是clone方法直接无视构造方法的权限，所以，单例模式与原型模式是冲突的，在使用时要特别注意
 * </p>
 * @author wangjunhao
 **/
public class ProtoTypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建一个原型对象
        Prototype prototype1 = new Prototype();
        prototype1.setMsg("prototype")
                .setInteger(0)
                .setNum(0)
                .setList(IntStream.rangeClosed(1, 10)
                        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll))
                .setArr(new int[]{1, 2, 3, 4, 5});

        // 深克隆
        Prototype prototype2 = prototype1.clone();
        // 浅克隆
        Prototype prototype3 = prototype1.shallowClone();

        show(prototype1, prototype2, prototype3);

        // 修改基本类型
        prototype1.setMsg("prototype1")
                .setInteger(1)
                .setNum(1);
        // 修改引用类型
        List<Integer> list = prototype1.getList();
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 1);
        }
        int[] arr = prototype1.getArr();
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }

        show(prototype1, prototype2, prototype3);
    }

    /**
     * <p>
     *     输出每个原型
     * </p>
     * @param prototypes 原型数组
     */
    public static void show(Prototype ...prototypes){
        for(Prototype prototype : prototypes){
            System.out.println(prototype);
        }
        System.out.println();
    }
}
