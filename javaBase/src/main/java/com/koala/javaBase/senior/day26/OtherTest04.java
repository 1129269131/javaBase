package com.koala.javaBase.senior.day26;

import org.junit.jupiter.api.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Create by koala on 2021-01-10
 *
 * 获取运行时类的父类
 *
 */
public class OtherTest04 {

    //获取运行时类的父类
    @Test
    public void test2(){
        Class clazz = Person01.class;

        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }

    //获取运行时类的带泛型的父类
    @Test
    public void test3(){
        Class clazz = Person01.class;

        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }

    //获取运行时类的带泛型的父类的泛型
    @Test
    public void test4(){
        Class clazz = Person01.class;

        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType paramType = (ParameterizedType) genericSuperclass;
        //获取泛型类型
        Type[] actualTypeArguments = paramType.getActualTypeArguments();
        //System.out.println(actualTypeArguments[0].getTypeName());
        System.out.println(((Class)actualTypeArguments[0]).getName());
    }

}
