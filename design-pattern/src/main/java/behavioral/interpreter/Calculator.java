package behavioral.interpreter;

import java.util.Stack;

/**
 * <h1>计算类</h1>
 *
 * @author wangjunhao
 **/
class Calculator {
    int calculate(String expression) {
        Stack<Expression> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char word = expression.charAt(i);
            switch (word) {
                case '加':
                    stack.push(new Add(stack.pop(), new Number(expression.charAt(++i))));
                    break;
                case '减':
                    stack.push(new Sub(stack.pop(), new Number(expression.charAt(++i))));
                    break;
                default:
                    stack.push(new Number(word));
                    break;
            }
        }
        return stack.pop().interpreter();
    }
}