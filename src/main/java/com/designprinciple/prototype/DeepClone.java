package com.designprinciple.prototype;

import java.util.ArrayList;

/**
 * @ClassName DeepClone
 * @Description 深拷贝
 * @User Administrator
 * @Date 2019/10/19
 **/
public class DeepClone implements Cloneable{
    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    protected DeepClone clone() throws CloneNotSupportedException {
        DeepClone deepClone = null;
        deepClone = (DeepClone)super.clone();
        deepClone.arrayList = (ArrayList<String>) this.arrayList.clone();
        return deepClone;
    }
}
