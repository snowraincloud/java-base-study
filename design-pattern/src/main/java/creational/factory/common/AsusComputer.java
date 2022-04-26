package creational.factory.common;

/**
 * <h1>华硕电脑</h1>
 *
 * @author wangjunhao
 **/
public class AsusComputer extends AbstractComputer{
    public AsusComputer(){
        super();
        this.brand = "Asus";
    }

    @Override
    public String toString() {
        return "AsusComputer{" +
                "brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", display='" + display + '\'' +
                ", ram=" + ram +
                ", hardDisk=" + hardDisk +
                '}';
    }
}
