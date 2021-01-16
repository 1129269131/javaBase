package basicgrammar.day01;

/**
 * Create by koala on 2020-11-10
 *
 * Java定义的数据类型
 *
 * 一、变量按照数据类型来分：
 *
 *      基本数据类型：
 *          整型：byte \ short \ int \ long
 *          浮点型：float \ double
 *          字符型：char
 *          布尔型：boolean
 *
 *      引用数据类型：
 *          类：class
 *          接口：interface
 *          数组：array
 *
 */
public class VariableTest01 {
    public static void main(String[] args) {
        //1.整型：byte \ short \ int \ long
        byte b1 = 127;
        byte b2 = -128;
        System.out.println(b1);
        System.out.println(b2);

        short s1 = 128;
        int i1 = 1234;
        long l1 = 3566565L;

        //2.浮点型：float \ double  注意：通常，定义浮点型变量时，使用double型
        double d1 = 123.3;
        System.out.println(d1);

        float f1 = 12.3f;
        System.out.println(f1);

        //3.字符型：char
        char c1 = 'a';
        System.out.println(c1);
        char c7 = 97;
        System.out.println(c7);

        char c2 = '1';
        char c3 = '中';
        char c4 = 'ん';
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        char c5 = '\n';
        System.out.println("hello" + c5);
        System.out.println("world");

        char c6 = '\u0043';
        System.out.println(c6);

        //4.布尔型：boolean
        boolean bl1 = true;
        System.out.println(bl1);
    }
}
