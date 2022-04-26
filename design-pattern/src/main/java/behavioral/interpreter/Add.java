package behavioral.interpreter;

/**
 * <h1>加法操作符</h1>
 *
 * @author wangjunhao
 **/
class Add extends Operator {

    Add(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter() {
        return left.interpreter() + right.interpreter();
    }
}
