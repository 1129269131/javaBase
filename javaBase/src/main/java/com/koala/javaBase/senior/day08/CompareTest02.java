package com.koala.javaBase.senior.day08;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Create by koala on 2021-01-01
 *
 * Comparator接口的使用：定制排序
 *
 *     1.背景：
 *     当元素的类型没有实现java.lang.Comparable接口而又不方便修改代码，
 *     或者实现了java.lang.Comparable接口的排序规则不适合当前的操作，
 *     那么可以考虑使用 Comparator 的对象来排序
 *     2.重写compare(Object o1,Object o2)方法，比较o1和o2的大小：
 *     如果方法返回正整数，则表示o1大于o2；
 *     如果返回0，表示相等；
 *     返回负整数，表示o1小于o2。
 *
 */
public class CompareTest02 {

    @Test
    public void test1(){
        String[] arr = new String[]{"AA","CC","KK","MM","GG","JJ","DD"};
        Arrays.sort(arr,new Comparator(){

            //按照字符串从大到小的顺序排列
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof  String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2(){
        Goods01[] arr = new Goods01[6];
        arr[0] = new Goods01("lenovoMouse",34);
        arr[1] = new Goods01("dellMouse",43);
        arr[2] = new Goods01("xiaomiMouse",12);
        arr[3] = new Goods01("huaweiMouse",65);
        arr[4] = new Goods01("huaweiMouse",224);
        arr[5] = new Goods01("microsoftMouse",43);

        Arrays.sort(arr, new Comparator() {
            //指明商品比较大小的方式:按照产品名称从低到高排序,再按照价格从高到低排序
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Goods01 && o2 instanceof Goods01){
                    Goods01 g1 = (Goods01)o1;
                    Goods01 g2 = (Goods01)o2;
                    if(g1.getName().equals(g2.getName())){
                        return -Double.compare(g1.getPrice(),g2.getPrice());
                    }else{
                        return g1.getName().compareTo(g2.getName());
                    }
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });

        System.out.println(Arrays.toString(arr));
    }

}
