package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>袋子</h1>
 * @author wangjunhao
 **/
public class Bag implements Article{
    private String name;
    private double price;
    private List<Article> list = new ArrayList<>();

    public Bag(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void add(Article c) {
        list.add(c);
    }
    public void remove(Article c) {
        list.remove(c);
    }

    @Override
    public double price() {
        return list.stream().mapToDouble(Article::price).sum() + price;
    }

    @Override
    public String name() {
        return list.isEmpty() ? name : name + "(" + list.stream()
                .map(Article::name)
                .reduce((l, r) -> l + "," + r).orElse("") + ")";
    }
}
