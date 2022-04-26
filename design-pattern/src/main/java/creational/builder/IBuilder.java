package creational.builder;

/**
 * <h1>建造者接口抽象</h1>
 *
 * @author wangjunhao
 **/
public interface IBuilder<T> {
    void reset();
    void setBrand(String brand);
    void setCpu(String cpu);
    void setMainBoard(String mainBoard);
    void setDisplay(String display);
    void setRam(int ram);
    void setHardDisk(int hardDisk);
    T getResult();
}
