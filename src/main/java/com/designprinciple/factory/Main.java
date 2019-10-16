package com.designprinciple.factory;

/**
 * @ClassName Main
 * @Description TODO
 * @User Administrator
 * @Date 2019/10/15
 **/
public class Main {
    public static void main(String[] args){
        AbstractFactory abstractFactory = new ConcreteFactory();
        //只需这里改变产品即可生产不同的产品
        AbstractProduct product = abstractFactory.createProduct(ConcreteProduct.class);
    }
}
