package com.designprinciple.interpreter;


/**
 * @ClassName Expression
 * @Description 抽象表达式
 * @User Administrator
 * @Date 2019/11/26
 **/
public abstract class Expression {
    public abstract Object interpreter(Context context);
}
