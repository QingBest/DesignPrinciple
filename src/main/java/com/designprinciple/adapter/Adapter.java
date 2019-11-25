package com.designprinciple.adapter;

/**
 * @ClassName Adapter
 * @Description 适配器角色
 * @User Administrator
 * @Date 2019/11/19
 **/
public class Adapter extends Adaptee implements Target{
    public void request() {
        super.doSomething();
    }
}
