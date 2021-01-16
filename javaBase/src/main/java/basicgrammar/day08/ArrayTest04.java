package basicgrammar.day08;

/**
 * Create by koala on 2020-11-22
 *
 * 二维数组的使用：
 * 	规定：二维数组分为外层数组的元素，内层数组的元素
 * 		int[][] arr = new int[4][3];
 * 		外层元素：arr[0],arr[1]等
 * 		内层元素：arr[0][0],arr[1][2]等
 *
 *   ⑤ 数组元素的默认初始化值
 *   针对于初始化方式一：比如：int[][] arr = new int[4][3];
 *      外层元素的初始化值为：地址值
 *      内层元素的初始化值为：与一维数组初始化情况相同
 *
 *   针对于初始化方式二：比如：int[][] arr = new int[4][];
 *   	外层元素的初始化值为：null
 *      内层元素的初始化值为：不能调用，否则报错。
 *
 *   ⑥ 数组的内存解析
 *
 */
public class ArrayTest04 {

    public static void main(String[] args) {

        int[][] arr1 = new int[4][3];
        System.out.println(arr1);//[[I@68f7aae2
        System.out.println(arr1[0]);//[I@4f47d241
        System.out.println(arr1[0][0]);//0

        System.out.println("*****************");
        int[][] arr2 = new int[3][];
        System.out.println(arr2[1]);//null

    }

}
