package behavioral.interpreter;

/**
 * <h1>解释器模式</h1>
 * <p>> 给定一门语言，定义它的文法的一种表示，并定义一个解释器，该解释器使用该表示来解释语言中的句子。</p>
 * <p>解释器模式包含以下主要角色。</p>
 * <ol>
 * <li>
 * 抽象表达式（Abstract Expression）角色：定义解释器的接口，约定解释器的解释操作，主要包含解释方法 interpret()。</li>
 * <li>
 * 终结符表达式（Terminal&nbsp;Expression）角色：是抽象表达式的子类，用来实现文法中与终结符相关的操作，文法中的每一个终结符都有一个具体终结表达式与之相对应。</li>
 * <li>
 * 非终结符表达式（Nonterminal Expression）角色：也是抽象表达式的子类，用来实现文法中与非终结符相关的操作，文法中的每条规则都对应于一个非终结符表达式。</li>
 * <li>
 * 环境（Context）角色：通常包含各个解释器需要的数据或是公共的功能，一般用来传递被所有解释器共享的数据，后面的解释器可以从这里获取这些值。</li>
 * <li>
 * 客户端（Client）：主要任务是将需要分析的句子或表达式转换成使用解释器对象描述的抽象语法树，然后调用解释器的解释方法，当然也可以通过环境角色间接访问解释器的解释方法。</li>
 * </ol>
 * @author wangjunhao
 **/
public class InterpreterTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String expression1 = "一加一";
        String expression2 = "一加一加一";
        String expression3 = "二加五减三";
        String expression4 = "七减五加四减一";
        String expression5 = "九减五加三减一";
        // 输出： 一加一 等于 2
        System.out.println(expression1 + " 等于 " + calculator.calculate(expression1));
        // 输出： 一加一加一 等于 3
        System.out.println(expression2 + " 等于 " + calculator.calculate(expression2));
        // 输出： 二加五减三 等于 4
        System.out.println(expression3 + " 等于 " + calculator.calculate(expression3));
        // 输出： 七减五加四减一 等于 5
        System.out.println(expression4 + " 等于 " + calculator.calculate(expression4));
        // 输出： 九减五加三减一 等于 6
        System.out.println(expression5 + " 等于 " + calculator.calculate(expression5));
    }
}
