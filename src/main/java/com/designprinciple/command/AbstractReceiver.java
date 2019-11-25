package com.designprinciple.command;

/**
 * @ClassName AbstractReceiver
 * @Description 抽象命令接收方
 * @User Administrator
 * @Date 2019/10/21
 **/
public abstract class AbstractReceiver {
    //抽象接收者，定义每个接收者都必须完成的业务
    public abstract void doSomething();
}
