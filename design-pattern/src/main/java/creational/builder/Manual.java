package creational.builder;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
public class Manual {
    private String brand;
    private String cpu;
    private String mainBoard;
    private String display;
    private int ram;
    private int hardDisk;

    public Manual(String brand, String cpu, String mainBoard, String display, int ram, int hardDisk) {
        this.brand = brand;
        this.cpu = cpu;
        this.mainBoard = mainBoard;
        this.display = display;
        this.ram = ram;
        this.hardDisk = hardDisk;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", display='" + display + '\'' +
                ", ram=" + ram +
                ", hardDisk=" + hardDisk +
                '}';
    }
}
