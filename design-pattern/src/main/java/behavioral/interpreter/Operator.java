package behavioral.interpreter;

/**
 * <h1>操作符抽象实现</h1>
 *
 * @author wangjunhao
 **/
abstract class Operator implements Expression {
    Expression left;
    Expression right;

    Operator(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
