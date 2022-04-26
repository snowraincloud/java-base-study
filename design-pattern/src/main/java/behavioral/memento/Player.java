package behavioral.memento;

/**
 * <h1>玩家</h1>
 *
 * @author wangjunhao
 **/
public class Player {
    // 生命值
    private int life = 100;
    // 魔法值
    private int magic = 100;

    public void fightBoss() {
        System.out.println("开始打Boss");
        life -= 100;
        magic -= 100;
        if (life <= 0) {
            System.out.println("壮烈牺牲");
        }
    }

    // 存档
    public Memento saveState() {
        System.out.println("存档");
        return new Memento(life, magic);
    }

    // 读档
    public void restoreState(Memento memento) {
        System.out.println("读档");
        this.life = memento.life;
        this.magic = memento.magic;
    }

    /**
     * <h2>玩家存档</h2>
     */
    public final class Memento {
        private int life;
        private int magic;

        Memento(int life, int magic) {
            this.life = life;
            this.magic = magic;
        }
    }
}
