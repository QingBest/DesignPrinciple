package com.designprinciple.visitor;

/**
 * @ClassName Visitor
 * @Description 具体访问者
 * @User Administrator
 * @Date 2019/11/26
 **/
public class Visitor implements IVisitor{
    public void visit(ConcreteElement1 element1) {
        element1.doSomething();
    }
}
