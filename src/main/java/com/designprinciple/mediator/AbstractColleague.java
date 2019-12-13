package com.designprinciple.mediator;

/**
 * @ClassName AbstractColleague
 * @Description 抽象同事类
 * @User Administrator
 * @Date 2019/10/19
 **/
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void selfMethod();
}
