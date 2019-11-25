package com.designprinciple.observer;

import java.util.Vector;

/**
 * @ClassName AbstractSubject
 * @Description 抽象被观察者
 * @User Administrator
 * @Date 2019/11/20
 **/
public abstract class AbstractSubject {
    //定义一个观察者数组
    private Vector<Observer> obsVector = new Vector<Observer>();

    //添加观察者
    public void addObserver(Observer o){
        this.obsVector.add(o);
    }

    //删除观察者
    public void delObserver(Observer o){
        this.obsVector.remove(o);
    }

    //通知所有观察者
    public void notifyObserver(){
        for (Observer obs : obsVector){
            obs.update();
        }
    }
}
