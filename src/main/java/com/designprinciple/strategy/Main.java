package com.designprinciple.strategy;

/**
 * @ClassName Main
 * @Description 主函数
 * @User Administrator
 * @Date 2019/11/18
 **/
public class Main {
    public static void main(String[] args){
        //声明一个具体的策略
        Strategy strategy = new ConcreteStrategy();
        //声明上下文对象
        Context context = new Context(strategy);
        //执行封装后的方法
        context.doAnything();
    }
}
