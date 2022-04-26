package behavioral.state;

/**
 * <h1>普通用户</h1>
 * @author wangjunhao
 **/
public class OrdinaryUser extends AbstractUser{

    @Override
    public void playVideo() {
        System.out.println("play video");
    }

    @Override
    public void playVipVideo() {
        System.out.println("Permission denied");
    }

    @Override
    public void buyVip() {
        System.out.println("buy vip");
        this.user.setUser(new VipUser());
    }

    @Override
    public void vipExpired() {
        System.out.println("not a vip");
    }
}
