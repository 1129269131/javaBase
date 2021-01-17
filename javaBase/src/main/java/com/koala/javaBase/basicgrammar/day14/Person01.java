package com.koala.javaBase.basicgrammar.day14;

/**
 * Create by koala on 2020-12-11
 */
public class Person01 extends Creature01{

    String name;
    private int age;

    public Person01(){

    }

    public Person01(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
        sleep();
    }

    private void sleep(){
        System.out.println("睡觉");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
