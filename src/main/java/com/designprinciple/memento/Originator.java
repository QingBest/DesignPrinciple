package com.designprinciple.memento;

/**
 * @ClassName Originator
 * @Description 发起人角色
 * @User Administrator
 * @Date 2019/11/21
 **/
public class Originator {
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(this.state);
    }

    public void restoreMemento(Memento _memento){

    }
}
