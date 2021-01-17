package com.koala.javaBase.basicgrammar.day16;

/**
 * Create by koala on 2020-12-17
 */
public class Student01 extends Person01 {

    String major;
    int id = 1002;//学号

    public Student01(){

    }

    public Student01(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生：多吃有营养的食物");
    }

    public void study() {
        System.out.println("学生：学习知识");
        this.eat();
        super.eat();
        walk();
    }

    public void show() {
        System.out.println("name = " + name + ",age = " + age);
        System.out.println("id = " + this.id);
        System.out.println("id = " + super.id);
    }

}
