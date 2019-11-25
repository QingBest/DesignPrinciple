package com.designprinciple.decorator;

/**
 * @ClassName Decorator
 * @Description 抽象装饰者
 * @User Administrator
 * @Date 2019/11/18
 **/
public abstract class AbstractDecorator extends AbstractComponent {

    private AbstractComponent component = null;

    //通过构造函数传递被修饰者
    public AbstractDecorator(AbstractComponent component) {
        this.component = component;
    }

    //委托给修饰者执行
    public void operate() {
        this.component.operate();
    }
}
