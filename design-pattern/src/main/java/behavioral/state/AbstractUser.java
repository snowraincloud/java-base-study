package behavioral.state;

/**
 * <h1>抽象用户</h1>
 * @author wangjunhao
 **/
public abstract class AbstractUser {
    protected AbstractUser user;

    public AbstractUser setUser(AbstractUser user) {
        this.user = user;
        return this;
    }

    public abstract void playVideo();

    public abstract void playVipVideo();

    public abstract void buyVip();

    public abstract void vipExpired();
}
