package com.designprinciple.strategy;

/**
 * @ClassName ConcreteStrategy
 * @Description 具体策略角色
 * @User Administrator
 * @Date 2019/11/18
 **/
public class ConcreteStrategy implements Strategy{
    public void doSomething() {
        System.out.println("具体的策略");
    }
}
