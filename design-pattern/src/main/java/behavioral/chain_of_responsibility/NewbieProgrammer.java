package behavioral.chain_of_responsibility;

/**
 * <h1>初级程序员</h1>
 * @author wangjunhao
 **/
public class NewbieProgrammer extends Programmer {

    @Override
    public void handle(Bug bug) {
        if (bug.value > 0 && bug.value <= 20) {
            solve(bug);
        } else if (next != null) {
            next.handle(bug);
        }
    }

    private void solve(Bug bug) {
        System.out.println("初级程序员解决了一个难度为 " + bug.value + " 的 bug");
    }
}
