package com.designprinciple.mediator;

/**
 * @ClassName Main
 * @Description 中介模式，不同同事类都通过中介来互相访问，不再是一种蜘蛛网的模式。
 * @User Administrator
 * @Date 2019/10/19
 **/
public class Main {
    public static void main(String[] args){
        //创建一个中介
        AbstractMediator mediator = new ConcreteMediator();
        //创建一个同事,并且注入中介者
        ConcreteColleague colleague = new ConcreteColleague(mediator);
        ConcreteColleagueNew newColleague = new ConcreteColleagueNew(mediator);
        //中介者，注入其他同事类，方便调用
        mediator.setConcreteColleague(newColleague);
        //完成自己一些事
        colleague.selfMethod();
        //与其他
        colleague.depMethod();
    }
}
