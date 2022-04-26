package creational.factory.common;

/**
 * <h1>计算机接口 默认实现</h1>
 *
 * @author wangjunhao
 **/
public abstract class AbstractComputer implements IComputer{
    protected String brand;
    protected String cpu;
    protected String mainBoard;
    protected String display;
    protected int ram;
    protected int hardDisk;

    @Override
    public void start() {
        System.out.println(brand + ": start");
    }

    @Override
    public String toString() {
        return "AbstractComputer{" +
                "brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", display='" + display + '\'' +
                ", ram=" + ram +
                ", hardDisk=" + hardDisk +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public AbstractComputer setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getCpu() {
        return cpu;
    }

    public AbstractComputer setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public AbstractComputer setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
        return this;
    }

    public String getDisplay() {
        return display;
    }

    public AbstractComputer setDisplay(String display) {
        this.display = display;
        return this;
    }

    public int getRam() {
        return ram;
    }

    public AbstractComputer setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public AbstractComputer setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
        return this;
    }
}
