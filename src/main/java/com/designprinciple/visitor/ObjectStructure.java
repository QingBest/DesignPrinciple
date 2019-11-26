package com.designprinciple.visitor;

import java.util.Random;

/**
 * @ClassName ObjectStructure
 * @Description 结构对象
 * @User Administrator
 * @Date 2019/11/26
 **/
public class ObjectStructure {
    public static Element createElement(){
        Random rand = new Random();
        if (rand.nextInt(100) >50){
            return new ConcreteElement1();
        }else {
            //其他ConcreteElement
            return null;
        }
    }
}
