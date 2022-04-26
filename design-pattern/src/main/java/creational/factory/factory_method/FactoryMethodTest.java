package creational.factory.factory_method;

import edu.wbu.pattern.creational.factory.common.IComputer;

/**
 * <h1>工厂方法模式</h1>
 * <p><b>
 *     工厂方法模式 是对简单工厂模式的进一步抽象化,其好处是可以使系统在不修改原来代码的情况下引进新的产品，即满足开闭原则。
 * </b></p>
 * <p>
 *    工厂方法模式由抽象工厂、具体工厂、抽象产品和具体产品等4个要素构成
 *    <ol>
 *        <li>
 *            抽象工厂（Abstract Factory）：提供了创建产品的接口，
 *            调用者通过它访问具体工厂的工厂方法来创建产品
 *        </li>
 *        <li>
 *            具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建
 *        </li>
 *        <li>
 *            抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。
 *        </li>
 *        <li>
 *            具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，
 *            它同具体工厂之间一一对应
 *        </li>
 *    </ol>
 * </p>
 * @see <a href="http://c.biancheng.net/view/1348.html">http://c.biancheng.net/view/1348.html</a>
 * @author wangjunhao
 **/
public class FactoryMethodTest {
    public static void main(String[] args) {
        // 获取联想电脑工厂
        IComputerFactory lenovoFactory = new LenovoComputerFactory();

        IComputer lenovo = lenovoFactory.createComputer();
        System.out.println(lenovo);

        lenovo.start();

        // 获取华硕电脑工厂
        IComputerFactory asusFactory = new AsusComputerFactory();

        IComputer asus = asusFactory.createComputer();

        System.out.println(asus);
        asus.start();
    }
}
