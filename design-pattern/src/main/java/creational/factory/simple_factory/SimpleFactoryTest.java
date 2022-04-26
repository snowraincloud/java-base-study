package creational.factory.simple_factory;

import edu.wbu.pattern.creational.factory.common.ComputerBrand;

/**
 * <h1>简单工厂模式</h1>
 * <p>
 *     简单工厂模式属于创建型模式，它属于类创建型模式。<br>
 *     它拥有一个包含大量条件语句的构建方法， 可根据方法的参数来选择对何种产品进行初始化并将其返回。。<br>
 *     简单工厂模式专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类<br>
 * </p>
 * @see <a href="https://www.jianshu.com/p/5cb52d84bd6d">https://www.jianshu.com/p/5cb52d84bd6d</a>
 * @author wangjunhao
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
        // 遍历每个品牌
        for (ComputerBrand brand: ComputerBrand.values()){
            // 获取品牌电脑并启动
            try {
                ComputerFactory.createComputer(brand).start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
