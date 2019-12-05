package com.designprinciple.bridge;

/**
 * @ClassName RefinedAbstraction
 * @Description 具体抽象化角色
 * @User Administrator
 * @Date 2019/11/26
 **/
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor imp) {
        super(imp);
    }

    //修正父类行为
    @Override
    public void request() {
        super.request();
        super.getImp().doAnything();
    }
}
