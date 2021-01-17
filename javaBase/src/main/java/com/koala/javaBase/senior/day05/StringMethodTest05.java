package com.koala.javaBase.senior.day05;

import org.junit.jupiter.api.Test;

/**
 * Create by koala on 2020-12-27
 *
 * boolean endsWith(String suffix)：测试此字符串是否以指定的后缀结束
 * boolean startsWith(String prefix)：测试此字符串是否以指定的前缀开始
 * boolean startsWith(String prefix, int toffset)：测试此字符串从指定索引开始的子字符串是否以指定前缀开始
 *
 * boolean contains(CharSequence s)：当且仅当此字符串包含指定的 char 值序列时，返回 true
 * int indexOf(String str)：返回指定子字符串在此字符串中第一次出现处的索引
 * int indexOf(String str, int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
 * int lastIndexOf(String str)：返回指定子字符串在此字符串中最右边出现处的索引
 * int lastIndexOf(String str, int fromIndex)：返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索
 *
 * 注：indexOf和lastIndexOf方法如果未找到都是返回-1
 *
 */
public class StringMethodTest05 {

    @Test
    public void test3(){
        String str1 = "hellowworld";
        boolean b1 = str1.endsWith("rld");
        System.out.println(b1);

        boolean b2 = str1.startsWith("He");
        System.out.println(b2);

        boolean b3 = str1.startsWith("ll",2);
        System.out.println(b3);

        String str2 = "wor";
        System.out.println(str1.contains(str2));

        System.out.println(str1.indexOf("lol"));

        System.out.println(str1.indexOf("lo",5));

        String str3 = "hellorworld";
        System.out.println(str3.lastIndexOf("or"));
        System.out.println(str3.lastIndexOf("or",6));
    }

}
