package com.koala.javaBase.senior.day25;

/**
 * Create by koala on 2021-01-10
 */
public class Person01 {

    private String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person01(String name, int age) {

        this.name = name;
        this.age = age;
    }

    private Person01(String name) {
        this.name = name;
    }

    public Person01() {
        System.out.println("Person01的空参构造器调用...");
    }

    public void show(){
        System.out.println("你好，我是一个人");
    }

    private String showNation(String nation){
        System.out.println("我的国籍是：" + nation);
        return nation;
    }

    @Override
    public String toString() {
        return "Person01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
