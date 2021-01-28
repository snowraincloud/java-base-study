package se.stream.intermediate.operations;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
public class SortedComparator {
    public static void main(String[] args) throws Exception {


        Stream.of("It's ", "a ", "wonderful ", "day ", "for ", "pie!")
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}

