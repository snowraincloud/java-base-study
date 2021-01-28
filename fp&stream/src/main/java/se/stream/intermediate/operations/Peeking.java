package se.stream.intermediate.operations;

import java.util.stream.IntStream;

/**
 * //TODO
 * peek() 操作的目的是帮助调试。它允许你无修改地查看流中的元素。代码示例：
 * @author wangjunhao
 **/
class Peeking {
    public static void main(String[] args) throws Exception {
        IntStream.range(1, 10)
                .peek(System.out::println)
                .map(i -> i + 100)
                .forEach(System.out::println);
    }
}

