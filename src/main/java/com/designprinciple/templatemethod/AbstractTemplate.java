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
        //这里利用了钩子方法，通用模型里是没有判断的
        if (this.isTrue()){
            this.baseMethod();
        }
    }
    //钩子方法
    protected boolean isTrue(){
        return true;
    }
}
