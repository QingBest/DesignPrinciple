package com.designprinciple.visitor;

/**
 * @ClassName ConcreteElement1
 * @Description 具体元素
 * @User Administrator
 * @Date 2019/11/26
 **/
public class ConcreteElement1 extends Element{
    public void doSomething() {
        //业务处理
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
