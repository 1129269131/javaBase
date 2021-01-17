package com.koala.javaBase.senior.day12;

import java.util.Objects;

/**
 * Create by koala on 2021-01-02
 */
public class Person02 {

    private String name;
    private int age;

    public Person02() {
    }

    public Person02(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Person02 equals()....");
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person02 person = (Person02) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

}
