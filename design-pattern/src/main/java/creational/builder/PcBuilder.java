package creational.builder;

/**
 * <h1>组装pc电脑</h1>
 *
 * @author wangjunhao
 **/
public class PcBuilder implements IBuilder<Computer> {

    private String brand;
    private String cpu;
    private String mainBoard;
    private String display;
    private int ram;
    private int hardDisk;

    @Override
    public void reset() {
        brand = null;
        cpu = null;
        mainBoard = null;
        display = null;
        ram = 0;
        hardDisk = 0;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    @Override
    public Computer getResult(){
        return new Computer(brand, cpu, mainBoard, display, ram, hardDisk);
    }
}
