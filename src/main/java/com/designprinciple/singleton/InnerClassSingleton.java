package com.designprinciple.singleton;

/**
 * @ClassName InnerClassSingleton
 * @Description 登记式/内部类模式
 * @User Administrator
 * @Date 2019/10/14
 **/
public class InnerClassSingleton {
    private static class singletonInnerClass{
        private static final InnerClassSingleton innerclasssingleton = new InnerClassSingleton();
    }
    private InnerClassSingleton(){}
    public static InnerClassSingleton getInstance(){
        return  singletonInnerClass.innerclasssingleton;
    }
}
