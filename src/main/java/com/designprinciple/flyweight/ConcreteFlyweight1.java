package com.designprinciple.flyweight;

/**
 * @ClassName ConcreteFlyweight1
 * @Description 具体享元角色
 * @User Administrator
 * @Date 2019/11/26
 **/
public class ConcreteFlyweight1 extends Flyweight {

    //接收外部状态
    public ConcreteFlyweight1(String extrinsic) {
        super(extrinsic);
    }

    //根据外部状态进行逻辑处理
    public void operate() {
        //业务处理
    }
}
