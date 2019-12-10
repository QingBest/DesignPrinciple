package com.designprinciple.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName DynamicProxy
 * @Description 需要提供被代理对象的类加载器loader，全部接口，以及自己的handler
 * @User Administrator
 * @Date 2019/10/18
 **/
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(Subject subject){
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocationHandler(subject);
        return (T) Proxy.newProxyInstance(classLoader,interfaces,handler);
    }
}
