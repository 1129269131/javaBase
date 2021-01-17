package com.koala.javaBase.basicgrammar.day18;

/**
 * Create by koala on 2020-12-17
 */
public class Man01 extends Person01 {

    int id = 1002;

    boolean isSmoking;

    @Override
    public void eat() {
        System.out.println("男人多吃肉，长肌肉");
    }

    public void earnMoney(){
        System.out.println("男人负责挣钱养家");
    }

}
