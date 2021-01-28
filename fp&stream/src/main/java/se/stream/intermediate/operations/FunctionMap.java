package se.stream.intermediate.operations;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * //TODO
 * map(Function)：将函数操作应用在输入流的元素中，并将返回值传递到输出流中。
 *
 * mapToInt(ToIntFunction)：操作同上，但结果是 IntStream。
 *
 * mapToLong(ToLongFunction)：操作同上，但结果是 LongStream。
 *
 * mapToDouble(ToDoubleFunction)：操作同上，但结果是 DoubleStream。
 * @author wangjunhao
 **/
class FunctionMap {
    static String[] elements = { "12", "", "23", "45" };
    static Stream<String>
    testStream() {
        return Arrays.stream(elements);
    }
    static void test(String descr, Function<String, String> func) {
        System.out.println(" ---( " + descr + " )---");
        testStream()
                .map(func)
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        test("add brackets", s -> "[" + s + "]");
        test("Increment", s -> {
                    try {
                        return Integer.parseInt(s) + 1 + "";
                    }
                    catch(NumberFormatException e) {
                        return s;
                    }
                }
        );
        test("Replace", s -> s.replace("2", "9"));
        test("Take last digit", s -> s.length() > 0 ?
                s.charAt(s.length() - 1) + "" : s);


        Stream.of("5", "7", "9")
                .mapToInt(Integer::parseInt)
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();
        Stream.of("17", "19", "23")
                .mapToLong(Long::parseLong)
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();
        Stream.of("17", "1.9", ".23")
                .mapToDouble(Double::parseDouble)
                .forEach(n -> System.out.format("%f ", n));
    }
}

