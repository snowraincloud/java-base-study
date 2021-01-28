package se.stream.terminal.operations;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

interface Matcher extends BiPredicate<Stream<Integer>, Predicate<Integer>> {}
/**
 * //TODO
 * allMatch(Predicate) ：如果流的每个元素提供给 Predicate 都返回 true ，结果返回为 true。在第一个 false 时，则停止执行计算。
 * anyMatch(Predicate)：如果流的任意一个元素提供给 Predicate 返回 true ，结果返回为 true。在第一个 true 是停止执行计算。
 * noneMatch(Predicate)：如果流的每个元素提供给 Predicate 都返回 false 时，结果返回为 true。在第一个 true 时停止执行计算
 * @author wangjunhao
 **/


public class Matching {
    static void show(Matcher match, int val) {
        System.out.println(
                match.test(
                        IntStream.rangeClosed(1, 9)
                                .boxed()
                                .peek(n -> System.out.format("%d ", n)),
                        n -> n < val));
    }
    public static void main(String[] args) {
        show(Stream::allMatch, 10);
        show(Stream::allMatch, 4);
        show(Stream::anyMatch, 2);
        show(Stream::anyMatch, 0);
        show(Stream::noneMatch, 5);
        show(Stream::noneMatch, 0);
    }
}

