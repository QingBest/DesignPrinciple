package com.designprinciple.observer;

/**
 * @ClassName Main
 * @Description 主函数
 * @User Administrator
 * @Date 2019/11/20
 **/
public class Main {
    public static void main(String[] args){
        //创建被观察者
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者
        Observer observer = new ConcreteObserver();
        //观察
        subject.addObserver(observer);
        //被观察者有行动被泄露
        subject.doSomething();
    }
}
