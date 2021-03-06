package com.koala.javaBase.senior.day11;

import java.util.ArrayList;

/**
 * Create by koala on 2021-01-02
 *
 * 6.2 类型注解：
 *    ElementType.TYPE_PARAMETER: 表示该注解能写在类型变量的声明语句中（如：泛型声明）
 *    ElementType.TYPE_USE: 表示该注解能写在使用类型的任何语句中
 *
 */
public class AnnotationTest06 {

    class Generic<@MyAnnotation06 T>{

        public void show() throws @MyAnnotation06 RuntimeException{

            ArrayList<@MyAnnotation06 String> list = new ArrayList<>();

            int num = (@MyAnnotation06 int) 10L;
        }

    }

}
