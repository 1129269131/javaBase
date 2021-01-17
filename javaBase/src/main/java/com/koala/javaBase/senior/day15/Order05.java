package com.koala.javaBase.senior.day15;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by koala on 2021-01-07
 *
 * 泛型方法
 *
 */
public class Order05<T> {

    String orderName;
    int orderId;

    //类的内部结构就可以使用类的泛型
    T orderT;

    public Order05(){

    }

    public Order05(String orderName,int orderId,T orderT){
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    //如下的三个方法都不是泛型方法
    public T getOrderT(){
        return orderT;
    }

    public void setOrderT(T orderT){
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order05{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }

    //泛型方法：在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系
    //换句话说，泛型方法所属的类是不是泛型类都没有关系
    //泛型方法，可以声明为静态的。原因：泛型参数是在调用方法时确定的。并非在实例化类时确定。
    //public static <E> List<E> copyFromArrayToList(E[] arr){
    public <E> List<E> copyFromArrayToList(E[] arr){
        ArrayList<E> list = new ArrayList<>();

        for(E e : arr){
            list.add(e);
        }

        return list;
    }

}
