package com.designprinciple.singleton;

/**
 * @ClassName HungrySingleton
 * @Description 枚举模式，最优模式
 * @User Administrator
 * @Date 2019/3/10
 **/
public enum EnumSingleton {
    INSTANCE;
    public void method(){
        System.out.println("这里写什么都行");
    }

    public static void main(String[] args){
        EnumSingleton.INSTANCE.method();
    }
}
