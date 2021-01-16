package basicgrammar.day01;

/**
 * Create by koala on 2020-11-11
 *
 * 基本数据类型之间的运算规则：
 *
 * 1.自动类型提升：
 *      byte、char、short --> int --> long --> float --> double
 *
 *      特别的：当byte、char、short三种类型的变量做运算时，结果为int型
 *
 * 2.强制类型转换
 *
 */
public class VariableTest02 {
    public static void main(String[] args) {

        byte b1 = 2;
        int i1 = 129;
        int i2 = b1 + i1;
        long l1 = b1 + i1;
        System.out.println(i2);
        System.out.println(l1);

        float f = b1 + i1;
        System.out.println(f);

        short s1 = 123;
        double d1 = s1;
        System.out.println(d1);

        //***********************************
        char c1 = 'a';//97
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);

        short s2 = 10;
        //char c3 = c1 + s2;//编译不通过

        byte b2 = 10;
        //char c3 = c1 + b2;//编译不通过

        //short s3 = b2 + s2; //编译不通过

        //short s4 = b1 + b2;//编译不通过

    }
}
