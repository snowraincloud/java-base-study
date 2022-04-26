package structural.flyweight;

import edu.wbu.pattern.structural.bridge.Circle;
import edu.wbu.pattern.structural.bridge.Shape;
import edu.wbu.pattern.structural.bridge.Square;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * <h1>形状工厂</h1>
 * @author wangjunhao
 **/
public class ShapeFactory {
    private static final Map<String, Color> cache = new HashMap<>();

    public static Shape getShape(String shape, String color){
        Shape res;
        switch (shape){
            case "circle":
                res = new Circle();
                break;
            case "square":
                res = new Square();
                break;
            default:
                throw new RuntimeException("形状类型错误");
        }
        res.setColor(Optional.ofNullable(cache.get(color)).orElseGet(() -> {
            cache.put(color, new Color(color));
            return cache.get(color);
        }));
        return res;
    }

}
