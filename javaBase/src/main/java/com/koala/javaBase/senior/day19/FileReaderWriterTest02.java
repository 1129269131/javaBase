package com.koala.javaBase.senior.day19;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Create by koala on 2021-01-09
 *
 * 将hello.txt文件内容读入程序中，并输出到控制台
 *
 *     说明点：
 *     1. read()的理解：返回读入的一个字符。如果达到文件末尾，返回-1
 *     2. 异常的处理：为了保证流资源一定可以执行关闭操作。需要使用try-catch-finally处理
 *     3. 读入的文件一定要存在，否则就会报FileNotFoundException
 *
 */
public class FileReaderWriterTest02 {

    @Test
    public void testFileReader(){
        FileReader fr = null;
        try {
            //1.实例化File类的对象，指明要操作的文件
            File file = new File("hello.txt");//相较于当前Module
            //2.提供具体的流
            fr = new FileReader(file);

            //3.数据的读入
            //read():返回读入的一个字符。如果达到文件末尾，返回-1
            int data;
            while((data = fr.read()) != -1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭操作
            try {
                if(fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //对read()操作升级：使用read的重载方法
    @Test
    public void testFileReader1()  {
        FileReader fr = null;
        try {
            //1.File类的实例化
            File file = new File("hello.txt");

            //2.FileReader流的实例化
            fr = new FileReader(file);

            //3.读入的操作
            //read(char[] cbuf):返回每次读入cbuf数组中的字符的个数。如果达到文件末尾，返回-1
            char[] cbuf = new char[5];
            int len;
            while((len = fr.read(cbuf)) != -1){
                //方式一：
                /*for(int i = 0;i < len;i++){
                    System.out.print(cbuf[i]);
                }*/
                //方式二：
                String str = new String(cbuf,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null){
                //4.资源的关闭
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
