package com.designprinciple.interpreter;


/**
 * @ClassName TerminalExpression
 * @Description 终结符表达式
 * @User Administrator
 * @Date 2019/11/26
 **/
public class TerminalExpression extends Expression {
    //通常终结符表达式只有一个，但是有多个对象
    public Object interpreter(Context context) {
        return null;
    }
}
