package com.designprinciple.proxy;

/**
 * @ClassName Proxy
 * @Description 代理类
 * @User Administrator
 * @Date 2019/10/17
 **/
public class Proxy extends Subject{
    private Subject subject = null;

    //默认代理者
    public Proxy(){
        this.subject = new Proxy();
    }

    //构造函数指定代理角色
    public Proxy(Subject subject){
        this.subject = subject;
    }

    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    private void before(){}
    private void after(){}
}
