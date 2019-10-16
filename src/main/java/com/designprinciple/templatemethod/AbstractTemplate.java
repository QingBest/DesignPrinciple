package com.designprinciple.templatemethod;

/**
 * @ClassName AbstractTemplate
 * @Description 抽象模板类
 * @User Administrator
 * @Date 2019/10/16
 **/
public abstract class AbstractTemplate {
    //多个基本方法
    protected abstract void baseMethod();
    //模板方法
    public void templeMethod(){
        this.baseMethod();
    }
}
