package com.koala.javaBase.senior.day14;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create by koala on 2021-01-06
 *
 * Collections 类中提供了多个 synchronizedXxx() 方法，
 * 该方法可使将指定集合包装成线程同步的集合，从而可以解决
 * 多线程并发访问集合时的线程安全问题
 *
 */
public class CollectionsTest02 {

    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(-97);
        list.add(0);

        //返回的list1即为线程安全的List
        List list1 = Collections.synchronizedList(list);
    }

}
