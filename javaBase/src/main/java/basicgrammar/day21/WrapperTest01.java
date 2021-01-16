package basicgrammar.day21;

import org.junit.jupiter.api.Test;

/**
 * Create by koala on 2020-12-19
 *
 * 包装类的使用:
 * 1.java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
 *
 * 2.掌握的：基本数据类型、包装类、String三者之间的相互转换
 *
 */
public class WrapperTest01 {

    //基本数据类型 --->包装类：调用包装类的构造器
    @Test
    public void test1(){
        int num1 = 10;
        //System.out.println(num1.toString());
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());

        Integer in2 = new Integer("123");
        System.out.println(in2.toString());

        //报异常
        /*Integer in3 = new Integer("123abc");
        System.out.println(in3);*/

        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1);
        System.out.println(f2);

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("TrUe");
        System.out.println(b1);
        System.out.println(b2);
        Boolean b3 = new Boolean("true123");
        System.out.println(b3);//false

        Order order = new Order();
        System.out.println(order.isMale);//false
        System.out.println(order.isFemale);//null
    }

    //包装类--->基本数据类型:调用包装类Xxx的xxxValue()
    @Test
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 + 1);
    }

    /*
     * JDK 5.0 新特性：自动装箱 与自动拆箱
     */
    @Test
    public void test3(){
        //自动装箱：基本数据类型 --->包装类
        int num1 = 10;
        Integer in1 = num1;

        //自动拆箱：包装类--->基本数据类型
        int num2 = in1;
    }

    //基本数据类型、包装类--->String类型：调用String重载的valueOf(Xxx xxx)
    @Test
    public void test4(){
        int num1 = 10;
        //方式1：连接运算
        String str1 = num1 + "";
        //方式2：调用String的valueOf(Xxx xxx)
        String str2 = String.valueOf(num1);//"10"
        System.out.println(str2);

        Integer i1 = new Integer(12);
        String str3 = String.valueOf(i1);
        System.out.println(i1);
    }

    //String类型 --->基本数据类型、包装类：调用包装类的parseXxx(String s)
    @Test
    public void test5(){
        String str1 = "123";
        //int num1 = (int)str1;
        //Integer in1 = (Integer)str1;

        //可能会报NumberFormatException
        int num2 = Integer.parseInt(str1);
        System.out.println(num2);

        String str2 = "true123";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);//false
    }

}

class Order{

    boolean isMale;
    Boolean isFemale;

}
