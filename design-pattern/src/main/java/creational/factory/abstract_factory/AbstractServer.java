package creational.factory.abstract_factory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <h1>服务器接口 默认实现</h1>
 *
 * @author wangjunhao
 **/
@Getter
@Setter
@ToString
public abstract class AbstractServer implements IServer{
    protected String brand;
    protected String cpu;
    protected String mainBoard;
    protected int ram;
    protected int hardDisk;

    @Override
    public void start() {
        System.out.println(brand +"-server: start");
    }


}
