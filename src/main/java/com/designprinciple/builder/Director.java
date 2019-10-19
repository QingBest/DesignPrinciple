package com.designprinciple.builder;

/**
 * @ClassName Director
 * @Description 导演类
 * @User Administrator
 * @Date 2019/10/17
 **/
public class Director {
    private Builder builder = new ConcreteBuilder();

    public Product getProduct(){
        builder.setPart();
        return builder.buildProduct();
    }
}
