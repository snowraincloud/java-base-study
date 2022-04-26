package creational.factory.abstract_factory;

import lombok.ToString;

/**
 * <h1>华硕服务器</h1>
 *
 * @author wangjunhao
 **/
@ToString(callSuper = true)
public class AsusServer extends AbstractServer{
    AsusServer(){
        super();
        this.brand = "Asus";
    }


}
