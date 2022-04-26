package creational.factory.abstract_factory;

import edu.wbu.pattern.creational.factory.common.IComputer;
import edu.wbu.pattern.creational.factory.common.IStart;

/**
 * <h1>抽象工厂模式</h1>
 * <p>
 *     抽象工厂模式是工厂方法模式的升级版本，工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品<br>
 *     抽象工厂模式同工厂方法模式一样，也是由抽象工厂、具体工厂、抽象产品和具体产品等 4 个要素构成，
 *     但抽象工厂中方法个数不同，抽象产品的个数也不同。
 *     <ol>
 *         <li>
 *             抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法，可以创建多个不同等级的产品。
 *         </li>
 *         <li>
 *             具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。
 *         </li>
 *         <li>
 *             抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。
 *         </li>
 *         <li>
 *             具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间是多对一的关系。
 *         </li>
 *     </ol>
 * </p>
 * @see <a href="http://c.biancheng.net/view/1351.html">http://c.biancheng.net/view/1351.html</a>
 * @author wangjunhao
 **/
public class AbstractFactoryTest {

    public static void main(String[] args) {
        Factory lenovoFactory = new LenovoFactory();
        IComputer lenovoComputer = lenovoFactory.createComputer();
        IServer lenovoServer = lenovoFactory.createServe();

        Factory asusFactory = new AsusFactory();
        IComputer asusComputer = asusFactory.createComputer();
        IServer asusServer = asusFactory.createServe();

        show(lenovoComputer, lenovoServer, asusComputer, asusServer);
    }

    private static void show(IStart ... bootable){
        for (IStart iStart : bootable){
            iStart.start();
            System.out.println(iStart);
        }
    }
}
