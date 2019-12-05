package com.designprinciple.interpreter;


import java.util.Stack;

/**
 * @ClassName Main
 * @Description 主函数
 * @User Administrator
 * @Date 2019/11/26
 **/
public class Main {
    public static void main(String[] args){
        Context ctx = new Context();
        //通常定义一个语法容器，容纳一个具体的表达式，通常为ListArray，等
        Stack<Expression> stack = new Stack<Expression>();
        for (int i =0;i<5;i++){
            //产生语法判断，并产生递归调用
            stack.push(new TerminalExpression());
        }
        Expression exp = stack.pop();
        exp.interpreter(ctx);
    }
}
