package com.designprinciple.memento;

/**
 * @ClassName Caretaker
 * @Description 备忘录管理员角色
 * @User Administrator
 * @Date 2019/11/21
 **/
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
