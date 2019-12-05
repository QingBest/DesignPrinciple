package com.designprinciple.interpreter;

/**
 * @ClassName NonterminalExpression
 * @Description 非终结符表达式
 * @User Administrator
 * @Date 2019/11/26
 **/
public class NonterminalExpression extends Expression {

    public NonterminalExpression(Expression... expressions) {
        //每个非终结表达符表达式都会对其他表达式产生依赖
    }

    public Object interpreter(Context context) {
        //进行文法处理
        return null;
    }
}
