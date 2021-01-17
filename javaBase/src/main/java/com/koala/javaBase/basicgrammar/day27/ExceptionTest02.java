package com.koala.javaBase.basicgrammar.day27;

import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * Create by koala on 2020-12-25
 *
 * 一、异常体系结构
 *
 * java.lang.Throwable
 * 		|-----java.lang.Error:一般不编写针对性的代码进行处理
 * 		|-----java.lang.Exception:可以进行异常的处理
 * 			|------编译时异常(checked)
 * 					|-----IOException
 * 						|-----FileNotFoundException
 * 					|-----ClassNotFoundException
 * 			|------运行时异常(unchecked,RuntimeException)
 * 					|-----NullPointerException
 * 					|-----ArrayIndexOutOfBoundsException
 * 					|-----ClassCastException
 * 					|-----NumberFormatException
 * 					|-----ArithmeticException
 *
 */
public class ExceptionTest02 {

    //******************以下是运行时异常***********************
    //NullPointerException
    @Test
    public void test1(){
        String str = null;
        System.out.println(str.charAt(0));
    }

    //IndexOutOfBoundsException
    @Test
    public void test2(){
        //ArrayIndexOutOfBoundsException
		int[] arr = new int[10];
		System.out.println(arr[10]);
    }

    //ClassCastException
    @Test
    public void test3(){
        Object obj = new Date();
        String str = (String)obj;
    }

    //NumberFormatException
    @Test
    public void test4(){
        String str = "abc";
        int num = Integer.parseInt(str);
    }

    //ArithmeticException
    @Test
    public void test6(){
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

}
