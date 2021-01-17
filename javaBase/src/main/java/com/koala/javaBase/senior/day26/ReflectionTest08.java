package com.koala.javaBase.senior.day26;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

/**
 * Create by koala on 2021-01-10
 *
 * 调用运行时类中的指定的构造器
 *
 */
public class ReflectionTest08 {

    @Test
    public void testConstructor() throws Exception {
        Class clazz = Person01.class;

        //private Person(String name)
        /*
        1.获取指定的构造器
        getDeclaredConstructor():参数：指明构造器的参数列表
         */
        Constructor constructor = clazz.getDeclaredConstructor(String.class);

        //2.保证此构造器是可访问的
        constructor.setAccessible(true);

        //3.调用此构造器创建运行时类的对象
        Person01 per = (Person01) constructor.newInstance("Tom");
        System.out.println(per);
    }

}
