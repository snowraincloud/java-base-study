package se.fp.composition;


import java.util.function.Function;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
public class FunctionComposition {
    static Function<String, String>
            f1 = s -> {
        System.out.println("f1\t"+ s);
        return s.replace('A', '_');
    },
            f2 = s -> {
                System.out.println("f2\t" + s);
                return s.substring(3);
            },
            f3 = s -> {
                System.out.println("f3\t" + s);
                return s.toLowerCase();
            },
            f4 = f1.compose(f2).andThen(f3);
    public static void main(String[] args) {
        System.out.println(
                f4.apply("GO AFTER ALL AMBULANCES"));
    }
}
