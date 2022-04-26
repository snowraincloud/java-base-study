package structural.composite;

/**
 * <h1>组合模式</h1>
 * <p>可以将对象组合成树状结构， 并且能像使用独立对象一样使用它们。</p>
 * <p>组合模式包含以下主要角色。</p>
 * <ol>
 * 	<li>
 * 		抽象构件（IComponent）角色：它的主要作用是为树叶构件和树枝构件声明公共接口，并实现它们的默认行为。在透明式的组合模式中抽象构件还声明访问和管理子类的接口；在安全式的组合模式中不声明访问和管理子类的接口，管理工作由树枝构件完成。（总的抽象类或接口，定义一些通用的方法，比如新增、删除）</li>
 * 	<li>
 * 		树叶构件（Leaf）角色：是组合中的叶节点对象，它没有子节点，用于继承或实现抽象构件。</li>
 * 	<li>
 * 		树枝构件（Composite）角色 / 中间构件：是组合中的分支节点对象，它有子节点，用于继承和实现抽象构件。它的主要作用是存储和管理子部件，通常包含 Add()、Remove()、GetChild() 等方法。</li>
 * </ol>
 * @author wangjunhao
 **/
public class CompositeTest {
    public static void main(String[] args) {
        Goods pen = new Goods("笔", 5.5),
                pencilBox = new Goods("文具盒", 20),
                rubber = new Goods("橡皮", 1);

        Bag smallBag = new Bag("小袋子", 0.3);
        smallBag.add(rubber);

        Bag mediumBag = new Bag("中号袋子", 0.5);
        mediumBag.add(pen);
        mediumBag.add(smallBag);

        Bag bigBag = new Bag("大袋子", 1);
        bigBag.add(pencilBox);
        bigBag.add(mediumBag);
        System.out.println(bigBag.name());
        System.out.println(bigBag.price());
    }
}
