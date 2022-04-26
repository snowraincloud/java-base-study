package test;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
public class BlackBorderDirect extends AbstractComponentDirect{
    public BlackBorderDirect(IComponent component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("添加黑色边框");
    }
}
