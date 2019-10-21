package com.designprinciple.mediator;

/**
 * @ClassName AbstractMediator
 * @Description 抽象中介者
 * @User Administrator
 * @Date 2019/10/19
 **/
public abstract class AbstractMediator {
    //定义同事类
    protected ConcreteColleague concreteColleague;

    /**
     * 采用get/set的方式注入同事类，因为中介中不一定有同事
     */
    //获取同事类
    public ConcreteColleague getConcreteColleague(){
        return concreteColleague;
    }
    //设置同事类
    public void setConcreteColleague(ConcreteColleague concreteColleague){
        this.concreteColleague = concreteColleague;
    }
    //中介模式的业务逻辑处理
    public abstract void doSomething();
}
