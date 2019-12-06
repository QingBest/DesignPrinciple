package com.designprinciple.singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ClassName UpperLimitSingleton
 * @Description 有上限的单例，产生固定数量的实例，例如在内存中启动多个reader实例，需要读取文件时就可以快速响应
 * @User Administrator
 * @Date 2019/10/14
 **/
public class UpperLimitSingleton {
    //上限数量
    public static final int maxNumber = 2;
    //静态实例列表
    public static ArrayList<UpperLimitSingleton> upperlimitsingleton = new ArrayList<UpperLimitSingleton>();
    //初始化所有实例
    static {
        for (int i =0 ; i<maxNumber ;i++ ){
            upperlimitsingleton.add(new UpperLimitSingleton());
        }
    }
    private UpperLimitSingleton(){}

    //随机获取
    public static UpperLimitSingleton getInstance(){
        Random random = new Random();
        int number = random.nextInt(maxNumber);
        return upperlimitsingleton.get(number);
    }
}
