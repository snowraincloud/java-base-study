package se.stream.optionals;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * //TODO
 * filter(Predicate)：对 Optional 中的内容应用Predicate 并将结果返回。
 * 如果 Optional 不满足 Predicate ，将 Optional 转化为空 Optional 。如果 Optional 已经为空，则直接返回空Optional 。
 * @author wangjunhao
 **/
public class OptionalFilter {
    static String[] elements = {
            "Foo", "", "Bar", "Baz", "Bingo"
    };
    static Stream<String> testStream() {
        return Arrays.stream(elements);
    }
    static void test(String descr, Predicate<String> pred) {
        System.out.println(" ---( " + descr + " )---");
        for(int i = 0; i <= elements.length; i++) {
            System.out.println(
                    testStream()
                            .skip(i)
                            .findFirst()
                            .filter(pred));
        }
    }
    public static void main(String[] args) {
        test("true", str -> true);
        test("false", str -> false);
        test("str != \"\"", str -> str != "");
        test("str.length() == 3", str -> str.length() == 3);
        test("startsWith(\"B\")",
                str -> str.startsWith("B"));
    }
}
