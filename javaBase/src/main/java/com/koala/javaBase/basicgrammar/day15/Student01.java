package com.koala.javaBase.basicgrammar.day15;

/**
 * Create by koala on 2020-12-14
 */
public class Student01 extends Person01 {

    //对父类中的eat()进行了重写
    @Override
    public void eat(){
        System.out.println("学生应该多吃有营养的食物");
    }

    public void show(){
        System.out.println("我是一个学生");
    }

    @Override
    public String info(){
        return null;
    }

    /*public int info1(){
        return  1;
    }*/

}
