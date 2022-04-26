package structural.flyweight;

import java.util.Arrays;

/**
 * <h1>享元模式</h1>
 * @author wangjunhao
 **/
public class FlyweightTest {
    public static void main(String[] args) {
        for (String shape: Arrays.asList("circle", "square")){
            for (String color: Arrays.asList("red", "blue", "pink", "white", "black")){
                System.out.println(ShapeFactory.getShape(shape, color).getName());
            }
        }
    }
}
