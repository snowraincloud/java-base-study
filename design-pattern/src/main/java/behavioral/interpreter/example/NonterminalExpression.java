package behavioral.interpreter.example;

/**
 * //TODO
 *
 * @author wangjunhao
 **/
public class NonterminalExpression extends AbstractExpression{

    private AbstractExpression expression1;
    private AbstractExpression expression2;

    @Override
    public String interpret(String info) {
        return expression1.interpret(info) + expression2.interpret(info);
    }
}

