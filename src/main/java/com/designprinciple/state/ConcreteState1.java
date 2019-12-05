package com.designprinciple.state;

/**
 * @ClassName ConcreteState1
 * @Description 环境角色
 * @User Administrator
 * @Date 2019/11/26
 **/
public class ConcreteState1 extends State{
    public void handle1() {
        //本状态下必须处理的逻辑
    }

    public void handle2() {
        super.context.setCurrentState(Context.STATE2);
        super.context.handle2();
    }
}
