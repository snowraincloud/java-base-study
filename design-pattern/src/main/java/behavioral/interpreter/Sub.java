package behavioral.interpreter;

/**
 * <h1>减法操作符</h1>
 *
 * @author wangjunhao
 **/
class Sub extends Operator {

    Sub(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter() {
        return left.interpreter() - right.interpreter();
    }
}