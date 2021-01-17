package com.koala.javaBase.senior.day13;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by koala on 2021-01-06
 *
 *  Map中定义的方法：
 *
 *   添加、删除、修改操作：
 *   Object put(Object key,Object value)：将指定key-value添加到(或修改)当前map对象中
 *   void putAll(Map m):将m中的所有key-value对存放到当前map中
 *   Object remove(Object key)：移除指定key的key-value对，并返回value
 *   void clear()：清空当前map中的所有数据
 *
 */
public class MapTest03 {

    @Test
    public void test1(){
        Map map = new HashMap();
        //添加
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);
        //修改
        map.put("AA",87);
        System.out.println(map);

        Map map1 = new HashMap();
        map1.put("CC",123);
        map1.put("DD",123);
        map.putAll(map1);
        System.out.println(map);

        //remove(Object key)
        Object value = map.remove("CC");
        System.out.println(value);
        System.out.println(map);

        //clear()
        map.clear();
        System.out.println(map.size());
        System.out.println(map);
    }

}
