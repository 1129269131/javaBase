package com.koala.javaBase.basicgrammar.day01;

/**
 * Create by koala on 2020-11-12
 *
 * 强制类型转换：自动类型提升运算的逆运算
 * 1.需要使用强转符：()
 * 2.注意点：强制类型转换，可能导致精度损失
 *
 */
public class VariableTest03 {

    public static void main(String[] args) {
        double d1 = 12.9;
        //精度损失举例1
        int i1 = (int) d1;//截断操作
        System.out.println(i1);

        //没有精度损失
        long l1 = 123;
        short s2 = (short) l1;
        System.out.println(s2);

        //精度损失举例2
        int i2 = 128;
        byte b = (byte) i2;
        System.out.println(b);//-128
    }

}
