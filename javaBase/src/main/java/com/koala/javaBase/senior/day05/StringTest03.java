package com.koala.javaBase.senior.day05;

import org.junit.jupiter.api.Test;

/**
 * Create by koala on 2020-12-27
 *
 * 结论：
 *     1.常量与常量的拼接结果在常量池。且常量池中不会存在相同内容的常量。
 *     2.只要其中有一个是变量，结果就在堆中。
 *     3.如果拼接的结果调用intern()方法，返回值就在常量池中
 *
 */
public class StringTest03 {

    @Test
    public void test1(){
        String s1 = "javaEE";//常量池
        String s2 = "hadoop";//常量池

        String s3 = "javaEEhadoop";//常量池
        String s4 = "javaEE" + "hadoop";//常量池
        String s5 = s1 + "hadoop";//堆空间
        String s6 = "javaEE" + s2;//堆空间
        String s7 = s1 + s2;//堆空间

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false

        String s8 = s6.intern();//返回值得到的s8使用的常量池中已经存在的“javaEEhadoop”
        System.out.println(s3 == s8);//true

    }

    @Test
    public void test2(){
        String s1 = "javaEEhadoop";

        final String s2 = "javaEE";//s4:常量
        String s3 = s2 + "hadoop";
        System.out.println(s1 == s3);//true
    }

}
