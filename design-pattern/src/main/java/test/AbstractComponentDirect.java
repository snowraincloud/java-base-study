package test;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
public abstract class AbstractComponentDirect implements IComponent{
    private IComponent component;
    public AbstractComponentDirect(IComponent component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
