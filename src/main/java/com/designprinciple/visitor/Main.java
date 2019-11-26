package com.designprinciple.visitor;

/**
 * @ClassName Main
 * @Description 主函数
 * @User Administrator
 * @Date 2019/11/26
 **/
public class Main {
    public static void main(String[] args){
        for (int i=0;i<10;i++){
            Element element = ObjectStructure.createElement();
            element.accept(new Visitor());
        }
    }
}
