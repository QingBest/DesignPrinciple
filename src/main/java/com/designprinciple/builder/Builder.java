package com.designprinciple.builder;

/**
 * @ClassName Builder
 * @Description 抽象建造者
 * @User Administrator
 * @Date 2019/10/17
 **/
public abstract class Builder {
    //设置产品的不同部分
    public abstract void setPart();
    //建造产品
    public abstract Product buildProduct();
}
