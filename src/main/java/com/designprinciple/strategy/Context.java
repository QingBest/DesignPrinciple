package com.designprinciple.strategy;

/**
 * @ClassName Context
 * @Description 封装角色
 * @User Administrator
 * @Date 2019/11/18
 **/
public class Context {
    //抽象策略
    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    //封装后的策略方法
    public void doAnything(){
        this.strategy.doSomething();
    }
}
