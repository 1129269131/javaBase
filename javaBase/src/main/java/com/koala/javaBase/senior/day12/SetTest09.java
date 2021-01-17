package com.koala.javaBase.senior.day12;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Create by koala on 2021-01-04
 *
 * LinkedHashSet的使用
 * LinkedHashSet作为HashSet的子类，在添加数据的同时，每个数据还维护了两个引用，记录此数据前一个
 * 数据和后一个数据。
 * 优点：对于频繁的遍历操作，LinkedHashSet效率高于HashSet
 *
 */
public class SetTest09 {

    @Test
    public void test2(){
        Set set = new LinkedHashSet();
        set.add(456);
        set.add(123);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new User07("Tom",12));
        set.add(new User07("Tom",12));
        set.add(129);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
