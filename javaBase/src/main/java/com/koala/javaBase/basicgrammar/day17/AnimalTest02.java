package com.koala.javaBase.basicgrammar.day17;

/**
 * Create by koala on 2020-12-17
 *
 * 多态性的使用举例
 *
 */
public class AnimalTest02 {

    public static void main(String[] args) {
        AnimalTest02 test = new AnimalTest02();

        test.func(new Dog());
        test.func(new Cat());
    }

    public void func(Animal animal){//Animal animal = new Dog();
        animal.eat();
    }

}

class Animal{

    public void eat(){
        System.out.println("动物：进食");
    }

}

class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }

}

class Cat extends Animal{

    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
