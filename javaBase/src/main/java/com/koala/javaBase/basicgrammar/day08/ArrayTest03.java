package com.koala.javaBase.basicgrammar.day08;

/**
 * Create by koala on 2020-11-22
 *
 * 二维数组的使用
 *
 * 1.理解：
 * 对于二维数组的理解，我们可以看成是一维数组array1又作为另一个一维数组array2的元素而存在。
 * 其实，从数组底层的运行机制来看，其实没有多维数组。
 *
 * 2. 二维数组的使用:
 *   ① 二维数组的声明和初始化
 *   ② 如何调用数组的指定位置的元素
 *   ③ 如何获取数组的长度
 *   ④ 如何遍历数组
 *   ⑤ 数组元素的默认初始化值 :见 ArrayTest04.java
 *   ⑥ 数组的内存解析 :见 ArrayTest04.java
 *
 */
public class ArrayTest03 {

    public static void main(String[] args) {
        //1.二维数组的声明和初始化
        //静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
        //动态初始化1
        int[][] arr2 = new int[3][2];
        //动态初始化2
        int[][] arr3 = new int[3][];

        //另类写法
        int arr4[][] = new int[][]{{1,2,3},{4,5},{6,7,8}};
        int arr5[][] ={{1,2,3},{4,5},{6,7,8}};
        int[] arr6[] = new int[][]{{1,2,3},{4,5},{6,7,8}};
        int[] arr7[] = {{1,2,3},{4,5},{6,7,8}};

        //2.调用数组指定位置的元素
        System.out.println(arr1[0][1]);//2
        System.out.println(arr2[1][1]);//0

        arr3[1] = new int[4];
        System.out.println(arr3[1][0]);

        //3.获取数组的长度
        System.out.println(arr4.length);//3
        System.out.println(arr4[0].length);//3

        //4.遍历二维数组
        for(int i = 0;i < arr4.length;i++){
            for(int j = 0;j < arr4[i].length;j++){
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

    }

}
