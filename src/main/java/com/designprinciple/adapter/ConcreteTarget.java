package com.designprinciple.adapter;

/**
 * @ClassName ConcreteTarget
 * @Description 目标角色实现类
 * @User Administrator
 * @Date 2019/11/19
 **/
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("ConcreteTarget");
    }
}
