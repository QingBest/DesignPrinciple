package com.designprinciple.bridge;


/**
 * @ClassName Abstraction
 * @Description 抽象化角色
 * @User Administrator
 * @Date 2019/11/26
 **/
public abstract class Abstraction {
    //定义对实现化角色的引用
    private Implementor imp;

    //约束子类必须实现该构造函数
    public Abstraction(Implementor imp) {
        this.imp = imp;
    }

    //自身行为和属性
    public void request(){
        this.imp.doSomething();
    }

    //获得实现化角色
    public Implementor getImp(){
        return imp;
    }
}
