package com.designprinciple.factory;

/**
 * @ClassName AbstractFactory
 * @Description 抽象工厂类
 * @User Administrator
 * @Date 2019/10/15
 **/
public abstract class AbstractFactory {
    public abstract <T extends Product> T createProduct(Class<T> c);
}
