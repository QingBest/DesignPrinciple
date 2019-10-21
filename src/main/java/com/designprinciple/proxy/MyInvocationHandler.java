package com.designprinciple.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName MyInvocationHandler
 * @Description 动态代理
 * @User Administrator
 * @Date 2019/10/18
 **/
public class MyInvocationHandler implements InvocationHandler {

    //被代理对象
    private Object target = null;

    //构造函数设置对象
    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    //代理方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //dobefore
        Object invoke = method.invoke(this.target, args);
        //doafter
        return invoke;
    }
}
