package basicgrammar.day04;

/**
 * Create by koala on 2020-11-15
 *
 * 运算符之五：位运算符 （了解）
 *
 * 结论：
 * 1. 位运算符操作的都是整型的数据
 * 2. << ：在一定范围内，每向左移1位，相当于 * 2
 *    >> :在一定范围内，每向右移1位，相当于 / 2
 *
 *
 *
 * 面试题：最高效方式的计算2 * 8 ？  2 << 3  或 8 << 1
 */
public class BitTest05 {

    public static void main(String[] args) {
        int i = 21;
        i = -21;
        System.out.println("i << 2 :" + (i << 2));
        System.out.println("i << 3 :" + (i << 3));
        System.out.println("i << 27 :" + (i << 27));

        int m = 12;
        int n = 5;
        System.out.println("m & n :" + (m & n));
        System.out.println("m | n :" + (m | n));
        System.out.println("m ^ n :" + (m ^ n));
    }

}
