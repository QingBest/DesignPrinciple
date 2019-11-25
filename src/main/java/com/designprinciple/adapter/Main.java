package com.designprinciple.adapter;

/**
 * @ClassName Main
 * @Description TODO
 * @User Administrator
 * @Date 2019/11/19
 **/
public class Main {
    public static void main(String[] args){
        //原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        //增加了适配器角色后的业务逻辑
        Target target2 = new Adapter();
        target2.request();
    }
}
