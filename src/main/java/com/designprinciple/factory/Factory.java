package com.designprinciple.factory;

/**
 * @ClassName Factory
 * @Description 具体产品类
 * @User Administrator
 * @Date 2019/10/15
 **/
public class Factory extends AbstractFactory {
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
