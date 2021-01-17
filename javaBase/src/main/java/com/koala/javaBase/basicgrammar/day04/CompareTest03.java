package com.koala.javaBase.basicgrammar.day04;

/**
 * Create by koala on 2020-11-14
 *
 * 运算符之三：比较运算符
 * ==  !=  >  <  >= <=  instanceof
 *
 * 结论：
 * 1.比较运算符的结果是boolean类型
 * 2.区分 ==  和  =
 *
 */
public class CompareTest03 {

    public static void main(String[] args) {
        int i = 10;
        int j = 20;

        System.out.println(i == j);//false
        System.out.println(i = j);//20  解析：赋值运算i = j ，此时i等于20 输出i，所以结果为20

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b2 == b1);//false
        System.out.println(b2 = b1);//true
    }

}
