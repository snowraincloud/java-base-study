package se.stream.create;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
public class Builder {
    Stream.Builder<Integer> builder = Stream.builder();

    public Builder(){
        IntStream.rangeClosed(1, 10).forEach(i -> builder.add(i));
    }


    Stream<Integer> stream() {
        return builder.build();
    }

    public static void main(String[] args) {
        Builder builder = new Builder();

        builder.stream().forEach(System.out::println);
//        builder.stream().forEach(System.out::println);
    }
}
