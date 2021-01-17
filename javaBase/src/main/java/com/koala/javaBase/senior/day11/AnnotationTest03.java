package com.koala.javaBase.senior.day11;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;

/**
 * Create by koala on 2021-01-02
 *
 * 4. jdk 提供的4种元注解
 *   元注解：对现有的注解进行解释说明的注解
 *   Retention：指定所修饰的 Annotation 的生命周期：SOURCE\CLASS（默认行为）\RUNTIME
 *   只有声明为RUNTIME生命周期的注解，才能通过反射获取
 *   Target:用于指定被修饰的 Annotation 能用于修饰哪些程序元素
 *   *******出现的频率较低*******
 *   Documented:表示所修饰的注解在被javadoc解析时，保留下来
 *   Inherited:被它修饰的 Annotation 将具有继承性
 *
 */
public class AnnotationTest03 {

    @Test
    public void testGetAnnotation(){
        Class clazz = Student.class;
        Annotation[] annotations = clazz.getAnnotations();
        for(int i = 0;i < annotations.length;i++){
            System.out.println(annotations[i]);
        }
    }

    @MyAnnotation03(value="hi")
    class Person{
        private String name;
        private int age;

        public Person() {
        }
        @MyAnnotation03
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        @MyAnnotation03
        public void walk(){
            System.out.println("人走路");
        }
    }


    class Student extends Person{

        @Override
        public void walk() {
            System.out.println("学生走路");
        }

    }

}
