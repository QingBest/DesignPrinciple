package com.designprinciple.observer;

/**
 * @ClassName ConcreteObserver
 * @Description 具体观察者
 * @User Administrator
 * @Date 2019/11/20
 **/
public class ConcreteObserver implements Observer{
    public void update() {
        System.out.println("接收到信息，并进行处理");
    }
}
