package structural.composite;

/**
 * <h1>物品接口</h1>
 * @author wangjunhao
 **/
public interface Article {
    /**
     * <h2>返回物品价格</h2>
     * @return 价格
     */
    double price();

    /**
     * <h2>返回商品名称</h2>
     * @return 名称
     */
    String name();
}
