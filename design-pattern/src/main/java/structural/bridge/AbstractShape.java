package structural.bridge;

/**
 * <h1>形状抽象实现</h1>
 * @author wangjunhao
 **/
public class AbstractShape implements Shape{
    protected Color color;
    protected String name;

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String getName() {
        return color.getColor() + name;
    }
}
