package com.koala.javaBase.senior.day23;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * Create by koala on 2021-01-10
 *
 * 使用第三方jar包实现数据读写（\javaBase\libs\commons-io-2.5.jar）
 */
public class FileUtilsTest03 {

    @Test
    public void test1(){
        File srcFile = new File("爱情与友情.jpg");
        File destFile = new File("爱情与友情4.jpg");

        try {
            FileUtils.copyFile(srcFile,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
