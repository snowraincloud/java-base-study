package structural.adapter;

/**
 * <h1>电源适配器</h1>
 * <p>实现usb接口 输出5v</p>
 * @author wangjunhao
 **/
public class PowerAdapter implements UsbPort{

    private Socket socket;

    public PowerAdapter(Socket socket) {
        this.socket = socket;
    }

    @Override
    public Integer output() {
        return transformer();
    }

    public Integer transformer(){
        if (socket.getVoltage() < 5){
            throw new RuntimeException("电压不足");
        }
        return socket.getVoltage() - (socket.getVoltage() - 5);
    }

}

