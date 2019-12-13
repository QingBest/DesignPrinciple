package com.designprinciple.mediator;

/**
 * @ClassName ConcreteMediator
 * @Description 通用中介类
 * @User Administrator
 * @Date 2019/10/19
 **/
public class ConcreteMediator extends AbstractMediator{

    public void doSomething1() {
        //调用其他同事的业务逻辑
        super.Colleague.selfMethod1();
    }

    public void doSomething2() {
        //调用其他同事的业务逻辑
        super.Colleaguenew.selfMethod2();
    }
}
