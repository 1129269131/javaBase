package com.koala.javaBase.senior.day05;

import org.junit.jupiter.api.Test;

/**
 * Create by koala on 2020-12-29
 *
 * 替换：
 * String replace(char oldChar, char newChar)：返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
 * String replace(CharSequence target, CharSequence replacement)：使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
 * String replaceAll(String regex, String replacement)：使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
 * String replaceFirst(String regex, String replacement)：使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
 * 匹配:
 * boolean matches(String regex)：告知此字符串是否匹配给定的正则表达式。
 * 切片：
 * String[] split(String regex)：根据给定正则表达式的匹配拆分此字符串。
 * String[] split(String regex, int limit)：根据匹配给定的正则表达式来拆分此字符串，最多不超过limit个，如果超过了，剩下的全部都放到最后一个元素中。
 *
 */
public class StringMethodTest06 {

    @Test
    public void test1() {
        String str1 = "北京尚硅谷教育北京";
        String str2 = str1.replace('北', '东');
        System.out.println(str2);

        String str3 = str1.replace("北京", "上海");
        System.out.println(str3);

        System.out.println("*************************");

        String str = "12hello34world5java7891mysql456";
        //把字符串中的数字替换成,，如果结果中开头和结尾有，的话去掉
        String string = str.replaceAll("\\d+", ",").replaceAll("^,|,$", "");
        System.out.println(string);
    }

    @Test
    public void test2() {
        String str = "12345";
        //判断str字符串中是否全部有数字组成，即有1-n个数字组成
        boolean matches = str.matches("\\d+");
        System.out.println(matches);
    }

    @Test
    public void test3() {
        String str = "hello|world|java";
        String[] strs = str.split("\\|");
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

}
