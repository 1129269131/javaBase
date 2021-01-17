package com.koala.javaBase.senior.day13;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Create by koala on 2021-01-06
 */
public class MapTest02 {

    @Test
    public void test(){
        Map map = new LinkedHashMap();
        map.put(123,"AA");
        map.put(345,"BB");
        map.put(12,"CC");

        System.out.println(map);
    }

}
