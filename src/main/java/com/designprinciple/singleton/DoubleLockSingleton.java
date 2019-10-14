package com.designprinciple.singleton;

/**
 * @ClassName DoubleLockSingleton
 * @Description 双检锁模式
 * @User Administrator
 * @Date 2019/10/14
 **/
public class DoubleLockSingleton {
    private volatile  static DoubleLockSingleton doublelocksingleton;
    private DoubleLockSingleton(){}

    public static DoubleLockSingleton getSingleton4(){
        if (doublelocksingleton == null){
            synchronized(DoubleLockSingleton.class){
                if (doublelocksingleton == null){
                    doublelocksingleton = new DoubleLockSingleton();
                }
            }
        }
        return doublelocksingleton;
    }
}
