package com.designprinciple.memento;

/**
 * @ClassName Memento
 * @Description 备忘录角色
 * @User Administrator
 * @Date 2019/11/21
 **/
public class Memento {
    private String state = "";

    public Memento(String state) {
        this.state = state;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }
}
