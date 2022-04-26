package creational.factory.abstract_factory;

/**
 * <h1>联想服务器</h1>
 *
 * @author wangjunhao
 **/
public class LenovoServer extends AbstractServer{
    LenovoServer(){
        super();
        this.brand = "Lenovo";
    }

    @Override
    public String toString() {
        return "LenovoServer{" +
                "brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", ram=" + ram +
                ", hardDisk=" + hardDisk +
                '}';
    }
}
