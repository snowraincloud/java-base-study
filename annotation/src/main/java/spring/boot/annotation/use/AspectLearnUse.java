package spring.boot.annotation.use;

import org.springframework.stereotype.Component;
import spring.boot.annotation.AspectLearn;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
@Component
public class AspectLearnUse {

    @AspectLearn(value = "add", description = "return x + y")
    public int add(int x, int y){
        privateMethod();
        privateStaticMethod();
        System.out.println("add");
        return x + y;
    }

    @AspectLearn(value = "reduce", description = "return x - y")
    public int reduce(int x, int y){
        System.out.println("reduce");
        return x - y;
    }

    @AspectLearn(value = "multiply", description = "return x * y")
    public static int multiply(int x, int y){
        System.out.println("multiply");
        return x * y;
    }

    @AspectLearn("privateMethod")
    private void privateMethod(){
        System.out.println("privateMethod");
    }

    @AspectLearn("privateStaticMethod")
    private void privateStaticMethod(){
        System.out.println("privateStaticMethod");
    }

}
