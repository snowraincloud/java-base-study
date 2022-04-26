package structural.decorator;

/**
 * <h1>抽象基础装饰</h1>
 * @author wangjunhao
 **/
public abstract class DataSourceDecorator implements DataSource{

    private final DataSource wrapper;

    public DataSourceDecorator(DataSource wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}
