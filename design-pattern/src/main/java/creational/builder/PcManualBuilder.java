package creational.builder;

/**
 * <h1>pc使用手册</h1>
 *
 * @author wangjunhao
 **/
public class PcManualBuilder implements IBuilder<Manual> {
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
        this.brand = brand + "manual";
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
    public Manual getResult(){
        return new Manual(brand, cpu, mainBoard, display, ram, hardDisk);
    }
}
