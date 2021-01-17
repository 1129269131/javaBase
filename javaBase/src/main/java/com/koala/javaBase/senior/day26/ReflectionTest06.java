package com.koala.javaBase.senior.day26;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

/**
 * Create by koala on 2021-01-10
 *
 * 调用运行时类中指定的结构：属性、方法、构造器
 *
 */
public class ReflectionTest06 {

    //不需要掌握
    @Test
    public void testField() throws Exception {
        Class clazz = Person01.class;

        //创建运行时类的对象
        Person01 p = (Person01) clazz.newInstance();

        //获取指定的属性：要求运行时类中属性声明为public
        //通常不采用此方法
        Field id = clazz.getField("id");

        /*
        设置当前属性的值
        set():参数1：指明设置哪个对象的属性   参数2：将此属性值设置为多少
         */
        id.set(p,1001);

        /*
        获取当前属性的值
        get():参数1：获取哪个对象的当前属性值
         */
        int pId = (int) id.get(p);
        System.out.println(pId);
    }

    //如何操作运行时类中的指定的属性 -- 需要掌握
    @Test
    public void testField1() throws Exception {
        Class clazz = Person01.class;

        //创建运行时类的对象
        Person01 p = (Person01) clazz.newInstance();

        //1. getDeclaredField(String fieldName):获取运行时类中指定变量名的属性
        Field name = clazz.getDeclaredField("name");

        //2.保证当前属性是可访问的
        name.setAccessible(true);
        //3.获取、设置指定对象的此属性值
        name.set(p,"Tom");

        System.out.println(name.get(p));
    }

}
