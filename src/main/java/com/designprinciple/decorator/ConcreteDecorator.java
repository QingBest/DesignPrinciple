package com.designprinciple.decorator;

/**
 * @ClassName ConcreteDecorator
 * @Description 具体装饰者
 * @User Administrator
 * @Date 2019/11/18
 **/
public class ConcreteDecorator extends AbstractDecorator {
    public ConcreteDecorator(AbstractComponent component) {
        super(component);
    }

    //定义自己的修饰方法
    private void method1(){
        System.out.println("method1 decorator");
    }

    //重写父类的operate()
    public void operate(){
        this.method1();
        super.operate();
    }
}
