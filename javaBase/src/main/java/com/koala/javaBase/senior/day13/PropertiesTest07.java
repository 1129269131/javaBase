package com.koala.javaBase.senior.day13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Create by koala on 2021-01-06
 *
 * Properties:常用来处理配置文件
 * key和value都是String类型
 *
 */
public class PropertiesTest07 {

    public static void main(String[] args)  {
        FileInputStream fis = null;
        try {
            Properties pros = new Properties();

            fis = new FileInputStream("PropertiesTest07.properties");
            pros.load(fis);//加载流对应的文件

            String name = pros.getProperty("name");
            String password = pros.getProperty("password");

            System.out.println("name = " + name + ", password = " + password);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
