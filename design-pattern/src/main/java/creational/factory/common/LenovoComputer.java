package creational.factory.common;

/**
 * <h1>联想电脑</h1>
 *
 * @author wangjunhao
 **/
public class LenovoComputer extends AbstractComputer{


    public LenovoComputer(){
        super();
        this.brand = "Lenovo";
    }

    @Override
    public String toString() {
        return "LenovoComputer{" +
                "brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", display='" + display + '\'' +
                ", ram=" + ram +
                ", hardDisk=" + hardDisk +
                '}';
    }
}
