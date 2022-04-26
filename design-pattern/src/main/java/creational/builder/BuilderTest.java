package creational.builder;

import java.util.Arrays;

/**
 * <h1>建造者模式</h1>
 * <p>
 *     建造型模式用于创建过程稳定，但配置多变的对象<br>
 *     将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。<br>
 * </p>
 * <p>
 *     经典的「建造者-指挥者」模式现在已经不太常用了，现在建造者模式主要用来通过链式调用生成不同的配置。
 * </p>
 * @see <a href='https://www.jianshu.com/p/afe090b2e19c'>https://www.jianshu.com/p/afe090b2e19c</a>
 * @author wangjunhao
 **/
public class BuilderTest {
    public static void main(String[] args) {
        // 工厂方法模式与建造者模式
        // 具体产品的创建由建造者负责
        // 可以实现工厂创建不同配置等级的产品
        Director director = new Director();
        for(IBuilder builder : Arrays.asList(new PcBuilder(), new PcManualBuilder())){
            // 设置建造者
            // 创建产品
            director.flagship(builder);
            System.out.println(builder.getResult());
            builder.reset();
            director.onlyDisplay(builder);
            System.out.println(builder.getResult());
        }

        // 链式调用
        System.out.println(new Computer.Builder()
                .mainBoard("board")
                .cpu("i5-7300")
                .ram(8)
                .build());
    }
}