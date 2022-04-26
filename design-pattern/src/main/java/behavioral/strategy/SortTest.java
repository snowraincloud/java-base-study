package behavioral.strategy;

import java.util.Arrays;

/**
 * <h1>策略模式</h1>
 * <p>定义一系列算法， 并将每种算法分别放入独立的类中， 以使算法的对象能够相互替换。</p>
 * <p>策略模式的主要角色如下。</p>
 * <ol>
 * <li>
 * 抽象策略（Strategy）类：定义了一个公共接口，各种不同的算法以不同的方式实现这个接口，环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现。</li>
 * <li>
 * 具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现。</li>
 * <li>
 * 环境（Context）类：持有一个策略类的引用，最终给客户端调用。</li>
 * </ol>
 * @author wangjunhao
 **/
public class SortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 1, 2, 3, 5, 4};
        Sort sort = new Sort(new BubbleSort());
        // 这里可以选择不同的策略完成排序
        // sort.setSort(new InsertSort());
        // sort.setSort(new SelectionSort());
        sort.sort(arr);
        // 输出 [1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(arr));
    }
}
