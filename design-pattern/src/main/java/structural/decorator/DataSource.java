package structural.decorator;

/**
 * <h1>读取和写入操作的通用数据接口</h1>
 * @author wangjunhao
 **/
public interface DataSource {
    void writeData(String data);
    String readData();
}
