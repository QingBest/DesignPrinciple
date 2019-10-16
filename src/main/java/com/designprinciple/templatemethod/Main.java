package com.designprinciple.templatemethod;

/**
 * @ClassName Main
 * @Description 主函数
 * @User Administrator
 * @Date 2019/10/16
 **/
public class Main {
    public static void main(String[] args){
        AbstractTemplate template = new ConcreteTemplate();
        template.templeMethod();
    }
}
