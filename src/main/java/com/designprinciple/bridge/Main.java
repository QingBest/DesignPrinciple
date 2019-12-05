package com.designprinciple.bridge;

/**
 * @ClassName Main
 * @Description 主函数
 * @User Administrator
 * @Date 2019/11/26
 **/
public class Main {
    public static void main(String[] args) {
        //定义一个实现化角色
        ConcreteImplementor1 concreteImplementor1 = new ConcreteImplementor1();
        //定义一个抽象化角色
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(concreteImplementor1);
        //执行行文
        refinedAbstraction.request();
    }
}
