package com.designprinciple.observer;

/**
 * @ClassName ConcreteSubject
 * @Description 具体观察者
 * @User Administrator
 * @Date 2019/11/20
 **/
public class ConcreteSubject extends  AbstractSubject{
    public void doSomething(){
        //具体业务
        super.notifyObserver();
    }
}
