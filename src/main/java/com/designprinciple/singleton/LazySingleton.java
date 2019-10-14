package com.designprinciple.singleton;

/**
 * @ClassName LazySingleton
 * @Description 懒汉式单例
 * @User Administrator
 * @Date 2019/10/14
 **/
public class LazySingleton {
    public static LazySingleton singleton = null;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if (singleton == null){
            //这里可能存在线程安全问题
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
