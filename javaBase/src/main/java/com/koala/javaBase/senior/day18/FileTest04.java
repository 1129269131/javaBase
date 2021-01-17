package com.koala.javaBase.senior.day18;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * Create by koala on 2021-01-08
 *
 * public boolean renameTo(File dest):把文件重命名为指定的文件路径
 *      比如：file1.renameTo(file2)为例：
 *         要想保证返回true,需要file1在硬盘中是存在的，且file2不能在硬盘中存在。
 *
 */
public class FileTest04 {

    @Test
    public void test1(){
        File file1 = new File("hello.txt");
        File file2 = new File("E:\\hi.txt");

        boolean renameTo = file1.renameTo(file2);
        System.out.println(renameTo);
    }

}
