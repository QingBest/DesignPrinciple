package com.designprinciple.mediator;

import com.designprinciple.state.Context;

/**
 * @ClassName AbstractMediator
 * @Description 抽象中介者
 * @User Administrator
 * @Date 2019/10/19
 **/
public abstract class AbstractMediator {
    //定义同事类,之所以没注入抽象的同事类，是因为每个同事类，调用的方法可能不一样，如果说都是相同的方法，那是可以注入抽象的同事类
    //所以只能注入具体的同事类
    protected ConcreteColleague Colleague;
    protected ConcreteColleagueNew Colleaguenew;

    /**
     * 采用get/set的方式注入同事类，因为中介中不一定有同事
     */
    //获取同事类
    public ConcreteColleague getConcreteColleague(){
        return Colleague;
    }
    //设置同事类
    public void setConcreteColleague(ConcreteColleagueNew colleaguenew){
        this.Colleaguenew = Colleaguenew;
    }

    public ConcreteColleagueNew getColleaguenew() {
        return Colleaguenew;
    }

    public void setColleaguenew(ConcreteColleague colleague) {
        Colleague = colleague;
    }

    //中介模式的业务逻辑处理
    public abstract void doSomething1();
    public abstract void doSomething2();
}
