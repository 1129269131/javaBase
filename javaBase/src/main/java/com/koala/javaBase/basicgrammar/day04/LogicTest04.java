package com.koala.javaBase.basicgrammar.day04;

/**
 * Create by koala on 2020-11-14
 *
 * 运算符之四：逻辑运算符
 *
 * & &&  | ||  !  ^
 *
 * 说明：
 * 1.逻辑运算符操作的都是boolean类型的变量
 *
 */
public class LogicTest04 {

    public static void main(String[] args) {
        //区分： & 与 &&
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if(b1 & (num1++ > 0)){
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }

        System.out.println("num1 = " + num1);

        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if(b2 && (num2++ > 0)){
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }

        System.out.println("num2 = " + num2);

        //区分：| 与 ||
        boolean b3 = false;
        b3 = true;
        int num3 = 10;
        if(b3 | (num3++ > 0)){
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }
        System.out.println("num3 = " + num3);

        boolean b4 = false;
        b4 = true;
        int num4 = 10;
        if(b4 || (num4++ > 0)){
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }
        System.out.println("num4 = " + num4);

    }

}
