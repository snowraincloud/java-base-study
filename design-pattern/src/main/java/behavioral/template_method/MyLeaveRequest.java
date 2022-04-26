package behavioral.template_method;

/**
 * <h1>我的请假</h1>
 * @author wangjunhao
 **/
public class MyLeaveRequest extends LeaveRequest{
    @Override
    String name() {
        return "wjh";
    }

    @Override
    String reason() {
        return "参加力扣周赛";
    }

    @Override
    String duration() {
        return "0.5";
    }
}
