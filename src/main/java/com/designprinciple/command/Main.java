package com.designprinciple.command;

/**
 * @ClassName Main
 * @Description TODO
 * @User Administrator
 * @Date 2019/10/21
 **/
public class Main {
    public static void main(String[] args){
        Invoker invoker = new Invoker();
        ConcreteCommand command = new ConcreteCommand();
        invoker.setCommand(command);
        invoker.action();
    }
}
