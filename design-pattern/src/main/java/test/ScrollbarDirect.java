package test;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
public class ScrollbarDirect extends AbstractComponentDirect{
    public ScrollbarDirect(IComponent component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("添加滚动条");
    }
}
