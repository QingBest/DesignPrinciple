package com.designprinciple.state;

/**
 * @ClassName State
 * @Description 抽象环境角色
 * @User Administrator
 * @Date 2019/11/26
 **/
public abstract class State {

    protected Context context;

    public void setContext(Context context){
        this.context = context;
    }

    public abstract void handle1();

    public abstract void handle2();
}
