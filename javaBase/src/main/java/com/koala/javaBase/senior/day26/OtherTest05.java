package com.koala.javaBase.senior.day26;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;

/**
 * Create by koala on 2021-01-10
 */
public class OtherTest05 {

    //获取运行时类实现的接口
    @Test
    public void test5(){
        Class clazz = Person01.class;

        Class[] interfaces = clazz.getInterfaces();
        for(Class c : interfaces){
            System.out.println(c);
        }

        System.out.println("**********************************************************************************");

        //获取运行时类的父类实现的接口
        Class[] interfaces1 = clazz.getSuperclass().getInterfaces();
        for(Class c : interfaces1){
            System.out.println(c);
        }
    }

    //获取运行时类所在的包
    @Test
    public void test6(){
        Class clazz = Person01.class;

        Package pack = clazz.getPackage();
        System.out.println(pack);
    }

    //获取运行时类声明的注解
    @Test
    public void test7(){
        Class clazz = Person01.class;

        Annotation[] annotations = clazz.getAnnotations();
        for(Annotation annos : annotations){
            System.out.println(annos);
        }
    }

}
