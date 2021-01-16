package senior.day05;

import org.junit.jupiter.api.Test;

/**
 * Create by koala on 2020-12-29
 *
 * String 与 char[]之间的转换
 *
 */
public class StringTest07 {

    //String --> char[]:调用String的toCharArray()
    @Test
    public void test1(){

        String str1 = "abc123";
        char[] charArray = str1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

    }

    //char[] --> String:调用String的构造器
    @Test
    public void test2(){

        char[] arr = new char[]{'h','e','l','l','o'};
        String str2 = new String(arr);
        System.out.println(str2);

    }

}
