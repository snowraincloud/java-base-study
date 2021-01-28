package se.stream.terminal.operations;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * //TODO
 * findFirst()：返回第一个流元素的 Optional，如果流为空返回 Optional.empty。
 * findAny(：返回含有任意流元素的 Optional，如果流为空返回 Optional.empty。
 * @author wangjunhao
 **/
public class SelectElement {
    private static int[] rints = new Random(48).ints(0, 1000).limit(100).toArray();
    public static IntStream rands() {
        return Arrays.stream(rints);
    }
    public static void main(String[] args) {
        System.out.println(rands().findFirst().getAsInt());
        System.out.println(
                rands().parallel().findFirst().getAsInt());
        System.out.println(rands().findAny().getAsInt());
        System.out.println(
                rands().parallel().findAny().getAsInt());
    }
}

