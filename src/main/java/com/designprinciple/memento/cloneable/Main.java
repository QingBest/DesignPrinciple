package com.designprinciple.memento.cloneable;

/**
 * @ClassName Main
 * @Description TODO
 * @User Administrator
 * @Date 2019/11/21
 **/
public class Main {
    public static void main(String[] args){
        Originator originator = new Originator();
        originator.setState("init state");
        originator.createMemento();
        originator.setState("edit state");
        originator.restoreMemento();
    }
}
