package com.designprinciple.decorator;

/**
 * @ClassName ConcreteComponent
 * @Description 具体构件
 * @User Administrator
 * @Date 2019/11/18
 **/
public class ConcreteComponent extends AbstractComponent {
    public void operate() {
        System.out.println("do something");
    }
}
