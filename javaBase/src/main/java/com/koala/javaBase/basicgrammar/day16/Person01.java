package com.koala.javaBase.basicgrammar.day16;

/**
 * Create by koala on 2020-12-17
 */
public class Person01 {

    String name;
    int age;
    int id = 1001;//身份证号

    public Person01(){
        System.out.println("我是父类的无参构造器！");
    }

    public Person01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("人：吃饭");
    }

    public void walk() {
        System.out.println("人：走路");
    }

}
