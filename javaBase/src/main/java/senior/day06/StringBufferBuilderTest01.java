package senior.day06;

/**
 * Create by koala on 2020-12-29
 *
 * String、StringBuffer、StringBuilder三者的异同？
 * 相同点：
 *      底层使用char[]存储
 * 不同点：
 *      String（JDK1.0）:不可变的字符序列；
 *      StringBuffer（JDK1.0）:可变的字符序列；线程安全的（synchronized），效率低；
 *      StringBuilder（JDK1.5）:可变的字符序列；线程不安全的，效率高；
 *
 *
 * 源码分析：
 *     String str = new String();//char[] value = new char[0];
 *     String str1 = new String("abc");//char[] value = new char[]{'a','b','c'};
 *
 *     StringBuffer sb1 = new StringBuffer();//char[] value = new char[16];底层创建了一个长度是16的数组。
 *     sb1.append('a');//value[0] = 'a';
 *     sb1.append('b');//value[1] = 'b';
 *
 *     StringBuffer sb2 = new StringBuffer("abc");//char[] value = new char["abc".length() + 16];
 *
 *     扩容问题:如果要添加的数据底层数组盛不下了，那就需要扩容底层的数组。
 *              默认情况下，扩容为原来容量的2倍 + 2，同时将原有数组中的元素复制到新的数组中。
 *
 *             指导意义：开发中建议大家使用：StringBuffer(int capacity) 或 StringBuilder(int capacity)
 *
 */
public class StringBufferBuilderTest01 {

}
