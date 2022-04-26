package creational.builder;

/**
 * <h1>主管类</h1>
 * <p>定义调用构造步骤的顺序， 这样你就可以创建和复用特定的产品配置。</p>
 * @author wangjunhao
 **/
public class Director {

    public void flagship(IBuilder builder){
        builder.setBrand("flagship");
        builder.setCpu("i9-9900k");
        builder.setDisplay("32寸，4K");
        builder.setRam(64);
        builder.setHardDisk(4000);
        builder.setMainBoard("flagship-mainBoard");
    }

    public void onlyDisplay(IBuilder builder){
        builder.setBrand("flagship");
        builder.setDisplay("32寸，4K");
    }
}
