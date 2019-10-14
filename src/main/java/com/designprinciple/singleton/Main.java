package com.designprinciple.singleton;

import org.apache.commons.lang3.SerializationUtils;

import java.lang.reflect.Constructor;

/**
 * @ClassName Main
 * @Description 反射攻击、序列化攻击
 * @User Administrator
 * @Date 2019/10/14
 **/
public class Main {
    public static void main(String[] args){
        try {
            //反射攻击
            DoubleLockSingleton singleton = DoubleLockSingleton.getSingleton4();
            Constructor<DoubleLockSingleton> constructor = DoubleLockSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            DoubleLockSingleton newSingleton = constructor.newInstance();
            System.out.println(singleton == newSingleton);

            //序列化攻击
            DoubleLockSingleton instance = DoubleLockSingleton.getSingleton4();
            byte[] serialize = SerializationUtils.serialize(instance);
            DoubleLockSingleton newInstance = SerializationUtils.deserialize(serialize);
            System.out.println(instance == newInstance);
        }catch (Exception e){

        }
    }
}
