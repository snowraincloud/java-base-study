package structural.decorator;

/**
 * <h1>装饰模式</h1>
 * <p>通过将对象放入包含行为的特殊封装对象中来为原对象绑定新的行为</p>
 * <p>装饰模式主要包含以下角色</p>
 * <ol>
 * 	<li>
 * 		抽象构件（IComponent）角色：定义一个抽象接口以规范准备接收附加责任的对象。</li>
 * 	<li>
 * 		具体构件（ConcreteComponent）角色：实现抽象构件，通过装饰角色为其添加一些职责。</li>
 * 	<li>
 * 		抽象装饰（Decorator）角色：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。</li>
 * 	<li>
 * 		具体装饰（ConcreteDecorator）角色：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。</li>
 * </ol>
 * @author wangjunhao
 **/
public class DecoratorTest {
    public static void main(String[] args) {
        String test = "abcdefg";

        DataSource dataSource = new EncryptionDecorator(new ConsoleDataSource());

        dataSource.writeData(test);
        System.out.println(dataSource.readData());

    }
}