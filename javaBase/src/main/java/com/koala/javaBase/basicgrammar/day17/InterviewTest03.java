package com.koala.javaBase.basicgrammar.day17;

import java.util.Random;

/**
 * Create by koala on 2020-12-17
 *
 * 多态是编译时行为还是运行时行为？
 * 答：运行时行为
 *
 */
public class InterviewTest03 {
    public static void main(String[] args) {
        int key = new Random().nextInt(3);
        System.out.println(key);

        Animal1 animal = getInstance(key);
        animal.eat();
    }

    public static Animal1 getInstance(int key) {
        switch (key) {
            case 0:
                return new Cat1();
            case 1:
                return new Dog1();
            default:
                return new Sheep1();
        }
    }
}

class Animal1 {

    protected void eat() {
        System.out.println("animal eat food");
    }

}

class Cat1 extends Animal1 {

    @Override
    protected void eat() {
        System.out.println("cat eat fish");
    }
}

class Dog1 extends Animal1 {

    @Override
    public void eat() {
        System.out.println("Dog eat bone");
    }

}

class Sheep1 extends Animal1 {

    @Override
    public void eat() {
        System.out.println("Sheep eat grass");
    }

}
