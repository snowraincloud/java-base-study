package structural.adapter;

/**
 * <h1>墙插</h1>
 * @author wangjunhao
 **/
public class Socket {
    private Integer voltage;

    public Socket(Integer voltage) {
        this.voltage = voltage;
    }

    public Integer getVoltage() {
        return voltage;
    }

    public Socket setVoltage(Integer voltage) {
        this.voltage = voltage;
        return this;
    }
}
