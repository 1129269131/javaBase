package com.koala.javaBase.senior.day19;

import java.io.File;

/**
 * Create by koala on 2021-01-09
 *
 * 一、流的分类：
 * 1.操作数据单位：字节流、字符流
 * 2.数据的流向：输入流、输出流
 * 3.流的角色：节点流、处理流
 *
 * 二、流的体系结构
 * 抽象基类        节点流（或文件流）                              缓冲流（处理流的一种）
 * InputStream     FileInputStream (read(byte[] buffer))           BufferedInputStream (read(byte[] buffer))
 * OutputStream    FileOutputStream (write(byte[] buffer,0,len))   BufferedOutputStream (write(byte[] buffer,0,len)) / flush()
 * Reader          FileReader (read(char[] cbuf))                  BufferedReader (read(char[] cbuf) / readLine())
 * Writer          FileWriter (write(char[] cbuf,0,len))           BufferedWriter (write(char[] cbuf,0,len) / flush())
 *
 */
public class FileReaderWriterTest01 {

    public static void main(String[] args) {
        File file = new File("hello.txt");//相较于当前工程
        System.out.println(file.getAbsolutePath());
    }

}
