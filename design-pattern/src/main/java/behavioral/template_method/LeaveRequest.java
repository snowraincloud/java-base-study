package behavioral.template_method;

/**
 * <h1>请假抽象类</h1>
 *
 * @author wangjunhao
 **/
public abstract class LeaveRequest {

    void request() {
        System.out.print("本人");
        System.out.print(name());
        System.out.print("因");
        System.out.print(reason());
        System.out.print("需请假");
        System.out.print(duration());
        System.out.print("天，望批准");
    }

    abstract String name();

    abstract String reason();

    abstract String duration();
}