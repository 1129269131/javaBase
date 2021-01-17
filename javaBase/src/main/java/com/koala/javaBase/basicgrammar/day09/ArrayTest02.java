package com.koala.javaBase.basicgrammar.day09;

/**
 * Create by koala on 2020-12-01
 *
 * 算法的考查：数组查找(线性查找、二分法查找)
 *
 */
public class ArrayTest02 {

    public static void main(String[] args) {

        //查找
        //线性查找：
        String[] arr = new String[]{"JJ","DD","MM","BB","GG","AA"};

        String dest = "BB";
        boolean isFlag = true;

        for (int i = 0; i < arr.length; i++) {

            if(dest.equals(arr[i])){
                isFlag = false;
                System.out.println("找到了指定的元素，位置为：" + i);
                break;
            }

        }
        if(isFlag){
            System.out.println("很遗憾，没有找到！");
        }

        //二分法查找：
        //前提：所要查找的数组必须有序
        int [] arr2 = new int[]{-98,-34,2,34,54,66,79,105,210,333};

        int dest1 = -34;
        int head = 0;//初始的首索引
        int end = arr2.length - 1;//初始的末索引
        boolean isFlag1 = true;

        while (head <= end){

            int middle = (head + end) / 2;

            if(dest1 == arr2[middle]){
                isFlag1 = false;
                System.out.println("找到了指定的元素，位置为：" + middle);
                break;
            } else if(arr2[middle] > dest1){
                end = middle - 1;
            } else {
                head = middle + 1;
            }
        }

        if(isFlag1){
            System.out.println("很遗憾，没有找到！");
        }

    }

}
