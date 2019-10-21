package com.designprinciple.mediator;

/**
 * @ClassName Main
 * @Description TODO
 * @User Administrator
 * @Date 2019/10/19
 **/
public class Main {
    public static void main(String[] args){
        AbstractMediator mediator = new ConcreteMediator();
        ConcreteColleague colleague = new ConcreteColleague(mediator);
        //可以有多个同事类，然后通过set注入同事类
        mediator.setConcreteColleague(colleague);
        //完成自己一些事
        colleague.selfMethod();
        //与其他
        colleague.depMethod();
    }
}
