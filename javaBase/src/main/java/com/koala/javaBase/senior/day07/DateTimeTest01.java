package com.koala.javaBase.senior.day07;

import org.junit.jupiter.api.Test;

/**
 * Create by koala on 2020-12-29
 *
 * JDK 8之前日期和时间的API
 *
 */
public class DateTimeTest01 {

    //1.System类中的currentTimeMillis()
    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        //返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差
        //称为时间戳
        System.out.println(time);
    }

}
