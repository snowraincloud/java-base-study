package behavioral.template_method;

/**
 * <h1>模版方法模式</h1>
 * <p>在超类中定义了一个算法的框架， 允许子类在不修改结构的情况下重写算法的特定步骤。</p>
 * <p>访问者模式包含以下主要角色。</p>
 * <ol>
 * <li>
 * 抽象访问者（Visitor）角色：定义一个访问具体元素的接口，为每个具体元素类对应一个访问操作 visit() ，该操作中的参数类型标识了被访问的具体元素。</li>
 * <li>
 * 具体访问者（ConcreteVisitor）角色：实现抽象访问者角色中声明的各个访问操作，确定访问者访问一个元素时该做什么。</li>
 * <li>
 * 抽象元素（Element）角色：声明一个包含接受操作 accept() 的接口，被接受的访问者对象作为 accept() 方法的参数。</li>
 * <li>
 * 具体元素（ConcreteElement）角色：实现抽象元素角色提供的 accept() 操作，其方法体通常都是 visitor.visit(this) ，另外具体元素中可能还包含本身业务逻辑的相关操作。</li>
 * <li>
 * 对象结构（Object Structure）角色：是一个包含元素角色的容器，提供让访问者对象遍历容器中的所有元素的方法，通常由 List、Set、Map 等聚合类实现。</li>
 * </ol>
 * @author wangjunhao
 **/
public class TemplateMethodTest {
    public static void main(String[] args) {
        new MyLeaveRequest().request();
    }
}
