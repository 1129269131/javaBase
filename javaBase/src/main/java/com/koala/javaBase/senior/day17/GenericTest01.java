package com.koala.javaBase.senior.day17;

import org.junit.jupiter.api.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by koala on 2021-01-08
 *
 * 1. 泛型在继承方面的体现
 * 虽然类A是类B的父类，但是G<A> 和 G<B>二者不具备子父类关系，二者是并列关系。
 * 补充：类A是类B的父类/接口，A<G> 是 B<G> 的父类
 *
 */
public class GenericTest01 {

    @Test
    public void test1(){

        Object obj = null;
        String str = null;
        obj = str;

        Object[] arr1 = null;
        String[] arr2 = null;
        arr1 = arr2;

        List<Object> list1 = null;
        List<String> list2 = new ArrayList<String>();
        //此时的list1和list2的类型不具有子父类关系
        //编译不通过
        //list1 = list2;

        //类比：编译不通过
        //Date date = new Date();
        //str = date;
    }

    @Test
    public void test2(){
        AbstractList<String> list1 = null;
        List<String> list2 = null;
        ArrayList<String> list3 = null;

        list1 = list3;
        list2 = list3;

        List<String> list4 = new ArrayList<>();
    }

}
