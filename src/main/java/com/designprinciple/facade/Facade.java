package com.designprinciple.facade;

/**
 * @ClassName Facade
 * @Description 门面对象
 * @User Administrator
 * @Date 2019/11/21
 **/
public class Facade {
    private SonSystem sonSystem = new SonSystem();

    public void menthodA(){
        this.sonSystem.doSomething();
    }

}
