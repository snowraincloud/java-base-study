package structural.adapter;

/**
 * <h1>适配器模式</h1>
 * <p>使接口不兼容的对象能够相互合作</p>
 * <p>适配器模式（Adapter）包含以下主要角色。</p>

 * <ol>
 * 	<li>
 * 		目标（Target）接口：当前系统业务所期待的接口，它可以是抽象类或接口。</li>
 * 	<li>
 * 		适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口。</li>
 * 	<li>
 * 		适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。</li>
 * </ol>
 * @author wangjunhao
 **/
public class AdapterTest {
    public static void main(String[] args) {
        Socket socket = new Socket(220);
        PowerAdapter powerAdapter = new PowerAdapter(socket);
        System.out.println("电压: " + powerAdapter.output());
    }
}
