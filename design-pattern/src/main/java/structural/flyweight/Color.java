package structural.flyweight;

/**
 * <h1>颜色类</h1>
 * @author wangjunhao
 **/
public class Color implements edu.wbu.pattern.structural.bridge.Color {
    private String color;

    public Color(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
