package structural.bridge;

/**
 * <h1>形状接口</h1>
 * @author wangjunhao
 **/
public interface Shape {
    /**
     * <h2>设置颜色</h2>
     * @param color 颜色
     */
    void setColor(Color color);

    /**
     * <h2>返回形状名称</h2>
     * @return 形状名称
     */
    String getName();
}
