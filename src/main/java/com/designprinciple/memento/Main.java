package com.designprinciple.memento;

/**
 * @ClassName Main
 * @Description TODO
 * @User Administrator
 * @Date 2019/11/21
 **/
public class Main {
    public static void main(String[] args){
        //定义发起人
        Originator originator = new Originator();
        //定义备忘录管理员
        Caretaker caretaker = new Caretaker();
        //创建一个备忘录
        caretaker.setMemento(originator.createMemento());
        //恢复一个备忘录
        originator.restoreMemento(caretaker.getMemento());
    }
}
