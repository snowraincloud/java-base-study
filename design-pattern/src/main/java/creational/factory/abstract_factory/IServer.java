package creational.factory.abstract_factory;

import edu.wbu.pattern.creational.factory.common.IStart;

/**
 * <h1>服务器 抽象接口</h1>
 * @author wangjunhao
 **/
public interface IServer extends IStart {
    /**
     * <h2>启动服务器</h2>
     */
    @Override
    void start();
}
