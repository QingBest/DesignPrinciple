package com.designprinciple.memento.cloneable;

/**
 * @ClassName Originator
 * @Description 精简掉了备忘录管理角色
 * @User Administrator
 * @Date 2019/11/21
 **/
public class Originator implements Cloneable{
    private Originator backup;
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void createMemento(){
        this.backup = this.clone();
    }

    public void restoreMemento(){
        this.setState(this.backup.getState());
    }

    @Override
    protected Originator clone(){
        try {
            return (Originator)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
