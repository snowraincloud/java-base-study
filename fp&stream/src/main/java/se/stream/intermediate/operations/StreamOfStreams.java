package se.stream.intermediate.operations;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * //TODO
 * 假设我们现在有了一个传入的元素流，并且打算对流元素使用 map() 函数。现在你已经找到了一些可爱并独一无二的函数功能，但是问题来了：这个函数功能是产生一个流。我们想要产生一个元素流，而实际却产生了一个元素流的流。
 *
 * flatMap() 做了两件事：将产生流的函数应用在每个元素上（与 map() 所做的相同），然后将每个流都扁平化为元素，因而最终产生的仅仅是元素。
 *
 * flatMap(Function)：当 Function 产生流时使用。
 *
 * flatMapToInt(Function)：当 Function 产生 IntStream 时使用。
 *
 * flatMapToLong(Function)：当 Function 产生 LongStream 时使用。
 *
 * flatMapToDouble(Function)：当 Function 产生 DoubleStream 时使用。
 * @author wangjunhao
 **/
public class StreamOfStreams {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .map(i -> Stream.of("Gonzo", "Kermit", "Beaker"))
                .map(e-> e.getClass().getName())
                .forEach(System.out::println);

        Stream.of(1, 2, 3)
                .flatMap(i -> Stream.of("Gonzo", "Kermit", "Beaker"))
                .forEach(System.out::println);


        Stream.of(1, 2, 3, 4, 5)
                .flatMapToInt(i -> IntStream.concat(
                        new Random(47).ints(0, 100).limit(i), IntStream.of(-1)))
                .forEach(n -> System.out.format("%d ", n));
    }
}

