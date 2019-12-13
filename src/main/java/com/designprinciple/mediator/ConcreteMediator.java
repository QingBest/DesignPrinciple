package com.designprinciple.mediator;

/**
 * @ClassName ConcreteMediator
 * @Description 通用中介类
 * @User Administrator
 * @Date 2019/10/19
 **/
public class ConcreteMediator extends AbstractMediator{
    public void doSomething() {
        //调用其他同事的业务逻辑
        super.Colleague.selfMethod();
    }
}
