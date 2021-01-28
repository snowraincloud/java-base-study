package se.stream.optionals;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * //TODO
 * 在我们学习终端操作（Terminal Operations）之前，我们必须考虑在一个空流中获取元素会发生什么。我们喜欢沿着“快乐路径”[^1]把流连接起来，
 * 同时假设流不会中断。然而，在流中放置 null 却会轻易令其中断。那么是否存在某种对象，可以在持有流元素的同时，即使在我们查找的元素不存在时，
 * 也能友好地对我们进行提示（也就是说，不会产生异常）？
 *Optional 可以实现这样的功能。一些标准流操作返回 Optional 对象，因为它们并不能保证预期结果一定存在。包括：
 *
 * findFirst() 返回一个包含第一个元素的 Optional 对象，如果流为空则返回 Optional.empty
 *
 * findAny() 返回包含任意元素的 Optional 对象，如果流为空则返回 Optional.empty
 *
 * max() 和 min() 返回一个包含最大值或者最小值的 Optional 对象，如果流为空则返回 Optional.empty
 *
 * reduce() 不再以 identity 形式开头，而是将其返回值包装在 Optional 中。（identity 对象成为其他形式的 reduce() 的默认结果，因此不存在空结果的风险）
 *
 * 对于数字流 IntStream、LongStream 和 DoubleStream，average() 会将结果包装在 Optional 以防止流为空。
 * @author wangjunhao
 **/
public class OptionalsFromEmptyStreams {
    public static void main(String[] args) {
        System.out.println(Stream.<String>empty()
                .findFirst());
        System.out.println(Stream.<String>empty()
                .findAny());
        System.out.println(Stream.<String>empty()
                .max(String.CASE_INSENSITIVE_ORDER));
        System.out.println(Stream.<String>empty()
                .min(String.CASE_INSENSITIVE_ORDER));
        System.out.println(Stream.<String>empty()
                .reduce((s1, s2) -> s1 + s2));
        System.out.println(IntStream.empty()
                .average());
    }
}

