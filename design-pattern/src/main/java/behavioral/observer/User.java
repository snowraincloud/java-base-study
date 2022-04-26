package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * <h1>用户</h1>
 * <p>可以关注他人，也可以被他人关注，可以收到关注的人的动态、投稿</p>
 * @author wangjunhao
 **/
public class User extends Observable implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendVideo(String video){
        String msg = name + " 发布了一个视频： " + video;
        System.out.println(msg);
        this.setChanged();
        this.notifyObservers(msg);
    }

    public void sendTrends(String trends){
        String msg = name + " 发布了一个动态： " + trends;
        System.out.println(msg);
        this.setChanged();
        this.notifyObservers(msg);
    }

    public void follow(User user){
        user.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " 收到：" + arg);
    }
}
