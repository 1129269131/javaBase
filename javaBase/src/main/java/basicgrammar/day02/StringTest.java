package basicgrammar.day02;

/**
 * Create by koala on 2020-11-12
 *
 * String类型变量的使用
 * 1.String属于引用数据类型
 * 2.String可以和8种基本数据类型变量做运算，且运算只能是连接运算
 * 3.运算的结果仍然是String类型
 *
 */
public class StringTest {

    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "";

        //char c = '';//编译不通过

        //*************************
        int number = 1001;
        String numberStr = "学号：";
        String info = numberStr + number + true;// +：连接运算
        System.out.println(info);

        //*************************
        //练习1
        char c = 'a';//97
        int num = 10;
        String str = "hello";
        System.out.println(c + num + str);//107hello
        System.out.println(c + str + num);//ahello10
        System.out.println(c + (num + str));//a10hello
        System.out.println((c + num) + str);//107hello
        System.out.println(str + num + c);//hello10a

        //练习2
        //* *
        System.out.println("*   *");
        System.out.println('*' + '\t' + '*');
        System.out.println('*' + "\t" + '*');
        System.out.println('*' + '\t' + "*");
        System.out.println('*' + ('\t' + "*"));

        //*************************
        //String str1 = 123;//编译不通过
        String str2 = "123";

        //以下两个编译不通过的原因：byte、char、short --> int --> long --> float --> double
        //int num1 = str2;//编译不通过
        //int num1 = (int)str2;//编译不通过
    }

}
