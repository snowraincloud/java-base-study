package se.stream.terminal.operations;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * //TODO
 * toArray()：将流转换成适当类型的数组。
 * toArray(generator)：在特殊情况下，生成自定义类型的数组。
 * 
 * 
 * forEach(Consumer)常见如 System.out::println 作为 Consumer 函数。
 * forEachOrdered(Consumer)： 保证 forEach 按照原始流顺序操作。
 * 第一种形式：无序操作，仅在引入并行流时才有意义。在 并发编程 章节之前我们不会深入研究这个问题。
 * 这里简单介绍下 parallel()：可实现多处理器并行操作。实现原理为将流分割为多个（通常数目为 CPU 核心数）并在不同处理器上分别执行操作。
 * 因为我们采用的是内部迭代，而不是外部迭代，所以这是可能实现的。
 * @author wangjunhao
 **/
public class ToArrayAndForEach {
    private static int[] rints = new Random(47).ints(0, 1000).limit(100).toArray();
    public static IntStream rands() {
        return Arrays.stream(rints);
    }
    static final int SZ = 14;
    public static void main(String[] args) {
        rands().limit(SZ)
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();
        rands().limit(SZ)
                .parallel()
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();
        rands().limit(SZ)
                .parallel()
                .forEachOrdered(n -> System.out.format("%d ", n));
    }
}

