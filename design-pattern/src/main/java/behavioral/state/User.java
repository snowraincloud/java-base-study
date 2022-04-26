package behavioral.state;

/**
 * <h1>用户代理</h1>
 * @author wangjunhao
 **/
public class User extends AbstractUser {

    public User() {
        super();
        this.user = new OrdinaryUser();
        this.user.setUser(this);
    }

    public User(AbstractUser user) {
        super();
        this.user = user;
        this.user.setUser(this);
    }

    @Override
    public void playVideo() {
        user.playVideo();
    }

    @Override
    public void playVipVideo() {
        user.playVipVideo();
    }

    @Override
    public void buyVip() {
        user.buyVip();
    }

    @Override
    public void vipExpired() {
        user.vipExpired();
    }

    public void changeUser(AbstractUser user) {
        this.user = user;
    }
}
