package com.designprinciple.command;

/**
 * @ClassName ConcreteReceiver
 * @Description 具体接收方
 * @User Administrator
 * @Date 2019/10/21
 **/
public class ConcreteReceiver extends AbstractReceiver {
    public void doSomething() {
        System.out.println("处理具体业务逻辑");
    }
}
