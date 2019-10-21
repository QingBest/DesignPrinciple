package com.designprinciple.proxy;

/**
 * @ClassName Main
 * @Description TODO
 * @User Administrator
 * @Date 2019/10/18
 **/
public class Main {
    public static void main(String[] args){
        Subject subject = new RealSubject();
        Subject proxy = DynamicProxy.newProxyInstance(subject);
        proxy.request();
    }
}
