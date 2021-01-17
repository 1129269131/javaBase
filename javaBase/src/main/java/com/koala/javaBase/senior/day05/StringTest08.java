package com.koala.javaBase.senior.day05;

import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Create by koala on 2020-12-29
 *
 * String 与 byte[]之间的转换
 *  编码：String --> byte[]:调用String的getBytes()
 *  解码：byte[] --> String:调用String的构造器
 *
 *  编码：字符串 --> 字节 (看得懂 ---> 看不懂的二进制数据)
 *  解码：编码的逆过程，字节 --> 字符串（看不懂的二进制数据 ---> 看得懂）
 *
 *  说明：解码时，要求解码使用的字符集必须与编码时使用的字符集一致，否则会出现乱码
 *
 */
public class StringTest08 {

    @Test
    public void test3() throws UnsupportedEncodingException {

        String str1 = "abc123中国";
        byte[] bytes = str1.getBytes();//使用默认的字符集，进行编码。
        System.out.println(Arrays.toString(bytes));

        byte[] gbks = str1.getBytes("gbk");//使用gbk字符集进行编码。
        System.out.println(Arrays.toString(gbks));

        System.out.println("******************");

        String str2 = new String(bytes);//使用默认的字符集，进行解码。
        System.out.println(str2);

        String str4 = new String(gbks, "gbk");
        System.out.println(str4);//没有出现乱码。原因：编码集和解码集一致！

    }

}
