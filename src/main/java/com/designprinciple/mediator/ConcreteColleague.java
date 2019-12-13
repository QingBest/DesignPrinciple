package com.designprinciple.mediator;

/**
 * @ClassName ConcreteColleague
 * @Description 具体同事类
 * @User Administrator
 * @Date 2019/10/19
 **/
public class ConcreteColleague extends AbstractColleague{
    //传递中介者
    public ConcreteColleague(AbstractMediator mediator) {
        super(mediator);
    }
    //自有方法
    public void selfMethod1(){
        System.out.println("selfMethod");
    }
    //依赖方法
    public void depMethod(){
        //自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething1();
    }

}
