package com.koala.javaBase.senior.day26;

/**
 * Create by koala on 2021-01-10
 */
@MyAnnotation01(value="hi")
public class Person01 extends Creature01<String> implements Comparable<String>,MyInterface01{

    private String name;
    int age;
    public int id;

    public Person01(){}

    @MyAnnotation01(value="abc")
    private Person01(String name){
        this.name = name;
    }

    Person01(String name,int age){
        this.name = name;
        this.age = age;
    }
    @MyAnnotation01
    private String show(String nation){
        System.out.println("我的国籍是：" + nation);
        return nation;
    }

    public String display(String interests,int age) throws NullPointerException,ClassCastException{
        return interests + age;
    }

    @Override
    public void info() {
        System.out.println("我是一个人");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    private static void showDesc(){
        System.out.println("我是一个可爱的人");
    }

    @Override
    public String toString() {
        return "Person01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}