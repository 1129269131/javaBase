package senior.day05;

import org.junit.jupiter.api.Test;

/**
 * Create by koala on 2020-12-27
 *
 * String的实例化方式：
 *     方式一：通过字面量定义的方式
 *     方式二：通过new + 构造器的方式
 *
 * String s = new String("abc");方式创建对象，在内存中创建了几个对象？
 *     两个:一个是堆空间中new结构，另一个是char[]对应的常量池中的数据："abc"
 *
 */
public class StringTest02 {

    @Test
    public void test1(){
        //通过字面量定义的方式：此时的s1和s2的数据javaEE声明在方法区中的字符串常量池中
        String s1 = "javaEE";
        String s2 = "javaEE";

        //通过new + 构造器的方式:此时的s3和s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//false
        System.out.println(s3 == s4);//false

        System.out.println("***********************");

        Person02 p1 = new Person02("Tom",12);
        Person02 p2 = new Person02("Tom",12);

        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name == p2.name);//true

        p1.name = "Jerry";
        System.out.println(p2.name);//Tom
    }

}
