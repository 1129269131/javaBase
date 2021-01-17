package com.koala.javaBase.senior.day26;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

/**
 * Create by koala on 2021-01-10
 *
 * 获取构造器结构
 *
 */
public class OtherTest03 {

    @Test
    public void test1(){
        Class clazz = Person01.class;
        //getConstructors():获取当前运行时类中声明为public的构造器
        Constructor[] constructors = clazz.getConstructors();
        for(Constructor c : constructors){
            System.out.println(c);
        }

        System.out.println("**********************************************************************************");

        //getDeclaredConstructors():获取当前运行时类中声明的所有的构造器
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for(Constructor c : declaredConstructors){
            System.out.println(c);
        }
    }

}
