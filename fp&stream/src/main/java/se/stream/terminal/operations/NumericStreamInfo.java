package se.stream.terminal.operations;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * //TODO
 * average() ：求取流元素平均值。
 * max() 和 min()：数值流操作无需 Comparator。
 * sum()：对所有流元素进行求和。
 * summaryStatistics()：生成可能有用的数据。
 * 目前并不太清楚这个方法存在的必要性，因为我们其实可以用更直接的方法获得需要的数据。
 * @author wangjunhao
 **/
// streams/NumericStreamInfo.java
public class NumericStreamInfo {
    private static int[] rints = new Random(48).ints(0, 1000).limit(100).toArray();
    public static IntStream rands() {
        return Arrays.stream(rints);
    }
    public static void main(String[] args) {
        System.out.println(rands().average().getAsDouble());
        System.out.println(rands().max().getAsInt());
        System.out.println(rands().min().getAsInt());
        System.out.println(rands().sum());
        System.out.println(rands().summaryStatistics());
    }
}

