package com.koala.javaBase.basicgrammar.day15;

/**
 * Create by koala on 2020-12-14
 */
public class Person01 {

    void eat(){
        System.out.println("吃饭");
    }

    public void walk(){
        show();
        eat();
    }

    private void show(){
        System.out.println("我是一个人");
    }

    public Object info(){
        return null;
    }

    public double info1(){
        return 1.0;
    }

}
