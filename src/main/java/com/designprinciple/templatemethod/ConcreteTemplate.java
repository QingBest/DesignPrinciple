package com.designprinciple.templatemethod;

/**
 * @ClassName ConcreteTemplate
 * @Description 具体模板类
 * @User Administrator
 * @Date 2019/10/16
 **/
public class ConcreteTemplate extends AbstractTemplate{
    @Override
    protected void baseMethod() {
        //业务逻辑
    }

    @Override
    protected boolean isTrue() {
        //钩子方法，重写
        return false;
    }
}
