package se.stream.intermediate.operations;

import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.LongStream.iterate;
import static java.util.stream.LongStream.rangeClosed;

/**
 * //TODO
 * distinct()：在 Randoms.java 类中的 distinct() 可用于消除流中的重复元素。相比创建一个 Set 集合来消除重复，该方法的工作量要少得多。
 *
 * filter(Predicate)：过滤操作，保留如下元素：若元素传递给过滤函数产生的结果为true 。
 * @author wangjunhao
 **/
public class Remove {
    public static Boolean isPrime(long n) {
        return rangeClosed(2, (long)Math.sqrt(n))
                .noneMatch(i -> n % i == 0);
    }
    public LongStream numbers() {
        return iterate(2, i -> i + 1)
                .filter(Remove::isPrime);
    }
    public static void main(String[] args) {
        new Remove().numbers()
                .limit(10)
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();
        new Remove().numbers()
                .skip(90)
                .limit(10)
                .forEach(n -> System.out.format("%d ", n));
        Stream.of(1, 1, 2, 3, 4, 5, 5)
                .distinct()
                .forEach(System.out::println);
    }
}
