package com.koala.javaBase.basicgrammar.day26;

/**
 * Create by koala on 2020-12-20
 */
public class InnerClassTest02 {

    //返回一个实现了Comparable接口的类的对象
    //方式一：
    public Comparable getComparable1(){

        //创建一个实现了Comparable接口的类:局部内部类
        class MyComparable implements Comparable{
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }

        //返回有名实现类的匿名对象
        return new MyComparable();
    }

    //方式二：
    public Comparable getComparable2(){

        //返回匿名实现类的匿名对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }

}
