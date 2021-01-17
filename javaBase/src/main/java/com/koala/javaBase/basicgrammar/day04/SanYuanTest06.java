package com.koala.javaBase.basicgrammar.day04;

/**
 * Create by koala on 2020-11-15
 *
 * 运算符之六：三元运算符
 * 1.结构：(条件表达式) ? 表达式1 : 表达式2
 * 2. 说明
 * ① 条件表达式的结果为boolean类型
 *
 */
public class SanYuanTest06 {

    public static void main(String[] args) {
        //获取两个整数的较大值
        int m = 12;
        int n = 5;

        int max = (m > n) ? m : n;
        System.out.println(max);
    }

}
