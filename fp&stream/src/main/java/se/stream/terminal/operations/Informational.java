package se.stream.terminal.operations;

import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * //TODO
 * count()：流中的元素个数。
 * max(Comparator)：根据所传入的 Comparator 所决定的“最大”元素。
 * min(Comparator)：根据所传入的 Comparator 所决定的“最小”元素。
 * @author wangjunhao
 **/
public class Informational {

    public static Stream<String> stream(String s){
        return Pattern.compile("\\w").splitAsStream(s);
    }

    public static void
    main(String[] args) throws Exception {
        System.out.println(
                stream("Cheese.dat").count());
        System.out.println(
                stream("Cheese.dataa")
                        .min(String.CASE_INSENSITIVE_ORDER)
                        .orElse("NONE"));
        System.out.println(
                stream("Cheese.dat")
                        .max(String.CASE_INSENSITIVE_ORDER)
                        .orElse("NONE"));
    }
}

