package basicgrammar.day07;

/**
 * Create by koala on 2020-11-19
 *
 * For循环结构的使用
 * 一、循环结构的4个要素
 * ① 初始化条件
 * ② 循环条件  --->是boolean类型
 * ③ 循环体
 * ④ 迭代条件
 *
 * 二、for循环的结构
 *
 * for(①;②;④){
 * 	③
 * }
 *
 * 执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ... - ②
 *
 */
public class ForTest01 {

    public static void main(String[] args) {

        for(int i = 1;i <= 5;i++){
            System.out.println("Hello World!");
        }

        int num = 1;
        for(System.out.print('a');num <= 3;System.out.print('c'),num++){
            System.out.print('b');
        }
        //输出结果：abcbcbc
    }

}
