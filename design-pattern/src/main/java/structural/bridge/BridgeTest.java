package structural.bridge;

import java.util.Arrays;

/**
 * <h1>桥接模式</h1>
 * <p>将一个大类或一系列紧密相关的类拆分为抽象和实现两个独立的层次结构， 从而能在开发时分别使用。</p>
 * <p>桥接（Bridge）模式包含以下主要角色。</p>
 * <ol>
 * 	<li>
 * 		抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用。</li>
 * 	<li>
 * 		扩展抽象化（Refined Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。</li>
 * 	<li>
 * 		实现化（Implementor）角色：定义实现化角色的接口，供扩展抽象化角色调用。</li>
 * 	<li>
 * 		具体实现化（Concrete Implementor）角色：给出实现化角色接口的具体实现。</li>
 * </ol>
 * @author wangjunhao
 **/
public class BridgeTest {
    public static void main(String[] args) {
        for (Shape shape : Arrays.asList(new Circle(), new Square())){
            for (Color color : Arrays.asList(new Red(), new Blue())){
                shape.setColor(color);
                System.out.println(shape.getName());
            }
        }

    }
}
