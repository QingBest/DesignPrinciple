package com.designprinciple.response;

/**
 * @ClassName Main
 * @Description 主函数
 * @User Administrator
 * @Date 2019/10/21
 **/
public class Main {
    public static void main(String[] args){
        //声明所有的处理节点
        AbstractHandler handler = new ConcreteHandler();
        AbstractHandler handler2 = new ConcreteHandler2();
        //设置链的处理顺序
        handler.setNext(handler2);
        //提价请求，返回结果
        Response response = handler.handleMessage(new Request());
    }
}
