package com.designprinciple.flyweight;

/**
 * @ClassName Flyweight
 * @Description 抽象享元角色
 * @User Administrator
 * @Date 2019/11/26
 **/
public abstract class Flyweight {
    //内部状态
    private String intrinsic;
    //外部状态
    protected final String Extrinsic;

    public Flyweight(String extrinsic) {
        Extrinsic = extrinsic;
    }

    //定义业务操作
    public abstract void operate();

    //内部状态

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
