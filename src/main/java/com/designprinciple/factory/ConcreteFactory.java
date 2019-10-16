package com.designprinciple.factory;

/**
 * @ClassName ConcreteFactory
 * @Description 具体产品类
 * @User Administrator
 * @Date 2019/10/15
 **/
public class ConcreteFactory extends AbstractFactory {
    public <T extends AbstractProduct> T createProduct(Class<T> c) {
        AbstractProduct product = null;
        try {
            product = (AbstractProduct) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
