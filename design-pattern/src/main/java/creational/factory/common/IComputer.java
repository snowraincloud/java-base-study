package creational.factory.common;

/**
 * <h1>计算机抽象 接口</h1>
 * @author wangjunhao
 **/
public interface IComputer extends IStart{
    /**
     * <h2>启动计算机</h2>
     */
    @Override
    void start();
}
