package com.designprinciple.mediator;

/**
 * @ClassName ConcreteColleagueNew
 * @Description 新同事类
 * @User Administrator
 * @Date 2019/12/11
 **/
public class ConcreteColleagueNew extends AbstractColleague{
    //传递中介者
    public ConcreteColleagueNew(AbstractMediator mediator) {
        super(mediator);
    }
    //自有方法
    public void selfMethod(){
        System.out.println("new selfMethod");
    }
    //依赖方法
    public void depMethod(){
        //自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething();
    }
}
