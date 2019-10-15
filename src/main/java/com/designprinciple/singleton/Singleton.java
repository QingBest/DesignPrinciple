package com.designprinciple.singleton;

/**
 * @ClassName Singleton
 * @Description 通用代码
 * @User Administrator
 * @Date 2019/10/15
 **/
public class Singleton {
    private static final Singleton singleton =  new Singleton();
    private Singleton(){}

    public static Singleton getSingleton() {
        return singleton;
    }

    public static void doSomething(){}
}
