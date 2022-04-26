package behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * <h1>迭代器模式</h1>
 * <p>在不暴露集合底层表现形式 （列表、 栈和树等） 的情况下遍历集合中所有的元素。</p>
 * <p>迭代器模式主要包含以下角色。</p>
 * <ol>
 * <li>
 * 抽象聚合（Aggregate）角色：定义存储、添加、删除聚合对象以及创建迭代器对象的接口。</li>
 * <li>
 * 具体聚合（ConcreteAggregate）角色：实现抽象聚合类，返回一个具体迭代器的实例。</li>
 * <li>
 * 抽象迭代器（Iterator）角色：定义访问和遍历聚合元素的接口，通常包含 hasNext()、first()、next() 等方法。</li>
 * <li>
 * 具体迭代器（Concretelterator）角色：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。</li>
 * </ol>
 * @author wangjunhao
 **/
public class IteratorTest {
    public static void main(String[] args) {
        StringList strings = new StringList(Arrays.asList("123", "a", "c", "H"));
        Iterator<String> itr = strings.iterator();
        System.out.println(itr);
        for (Iterator<String> it = itr; it.hasNext(); ) {
            String string = it.next();
            System.out.println(string);
        }
    }
}
