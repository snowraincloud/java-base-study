package structural.composite;

/**
 * <h1>商品</h1>
 * @author wangjunhao
 **/
public class Goods implements Article{
    private String name;
    private double price;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String name() {
        return name;
    }
}
