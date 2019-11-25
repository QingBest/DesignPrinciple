package com.designprinciple.decorator;

/**
 * @ClassName Main
 * @Description TODO
 * @User Administrator
 * @Date 2019/11/18
 **/
public class Main {
    public static void main(String[] args){
        AbstractComponent component = new ConcreteComponent();
        //装饰
        component = new ConcreteDecorator(component);
        component.operate();
    }
}
