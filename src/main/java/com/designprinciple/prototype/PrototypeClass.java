package com.designprinciple.prototype;

/**
 * @ClassName PrototypeClass
 * @Description 原型模式
 * @User Administrator
 * @Date 2019/10/18
 **/
public class PrototypeClass implements Cloneable{
    @Override
    protected PrototypeClass clone() throws CloneNotSupportedException {
        return (PrototypeClass) super.clone();
    }
}
