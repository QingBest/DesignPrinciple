package com.designprinciple.builder;

/**
 * @ClassName ConcreteBuilder
 * @Description 具体建造者
 * @User Administrator
 * @Date 2019/10/17
 **/
public class ConcreteBuilder extends Builder {

    private  Product product = new Product();

    public void setPart() {
        //产品类的逻辑处理
    }

    public Product buildProduct() {
        return product;
    }
}
