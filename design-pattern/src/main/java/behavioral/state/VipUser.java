package behavioral.state;

/**
 * <h1>会员</h1>
 *
 * @author wangjunhao
 **/
public class VipUser extends AbstractUser{

    @Override
    public void playVideo() {
        System.out.println("play video");
    }

    @Override
    public void playVipVideo() {
        System.out.println("play vip video");
    }

    @Override
    public void buyVip() {
        System.out.println("you are already a vip");
    }

    @Override
    public void vipExpired() {
        System.out.println("vip expired");
        this.setUser(new OrdinaryUser());
    }
}
