package com.designprinciple.singleton;

/**
 * @ClassName HungrySingleton
 * @Description 饿汉式单例
 * @User Administrator
 * @Date 2019/3/10
 **/
public class HungrySingleton {
    public static final HungrySingleton singleton = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return  singleton;
    }
}
