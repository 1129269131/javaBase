package com.koala.javaBase.senior.day25;

import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;

/**
 * Create by koala on 2021-01-10
 *
 * Class实例可以是哪些结构的说明
 *
 */
public class ReflectionTest03 {

    @Test
    public void test1(){
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        Class c6 = Override.class;
        Class c7 = int.class;
        Class c8 = void.class;
        Class c9 = Class.class;

        int[] a = new int[10];//元素类型：int型数组 元素维度：1维
        int[] b = new int[100];//元素类型：int型数组 元素维度：1维
        Class c10 = a.getClass();
        Class c11 = b.getClass();

        //只要数组的元素类型与维度一样，就是同一个Class
        System.out.println(c10 == c11);
    }

}
