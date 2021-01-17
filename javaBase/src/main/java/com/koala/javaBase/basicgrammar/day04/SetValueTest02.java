package com.koala.javaBase.basicgrammar.day04;

/**
 * Create by koala on 2020-11-14
 *
 * 运算符之二：赋值运算符
 * =  +=  -=  *=  /=  %=
 *
 */
public class SetValueTest02 {

    public static void main(String[] args) {
        //赋值符号：=
        int i1 = 10;
        int j1 = 10;

        int i2,j2;
        //连续赋值
        i2 = j2 = 10;

        int i3 = 10, j3 = 20;

        //******************
        int num1 = 10;
        num1 += 2;
        System.out.println(num1);

        //练习
        int n1 = 10;
        n1 += (n1++) + (++n1);//n1 = n1 + (n1++) + (++n1);
        System.out.println(n1);//32

    }

}
