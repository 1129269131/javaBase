package com.koala.javaBase.basicgrammar.day12;

/**
 * Create by koala on 2020-12-09
 */
public class OrderTest02 {

    public static void main(String[] args) {
        Order02 order = new Order02();

        order.orderDefault = 1;
        order.orderProtected = 2;
        order.orderPublic = 3;
        //出了Order类之后，私有的结构就不可以调用了
        //order.orderPrivate = 4;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();
        //出了Order类之后，私有的结构就不可以调用了
        //order.methodPrivate();
    }

}
