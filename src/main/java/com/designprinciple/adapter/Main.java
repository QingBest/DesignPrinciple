package com.designprinciple.adapter;

/**
 * @ClassName Main
 * @Description 使用适配器后，两个接口可以一起工作了。具体比如我们之恩能够访问目标角色，然后想要使用源角色，那通过适配器，我们就能调用到源角色了。
 * @User Administrator
 * @Date 2019/11/19
 **/
public class Main {
    public static void main(String[] args){
        //原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        //增加了适配器角色后的业务逻辑
        Target target2 = new Adapter();
        target2.request();
    }
}
