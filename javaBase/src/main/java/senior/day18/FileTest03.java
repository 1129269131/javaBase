package senior.day18;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Date;

/**
 * Create by koala on 2021-01-08
 *
 * public String getAbsolutePath()：获取绝对路径
 * public String getPath()：获取路径
 * public String getName()：获取名称
 * public String getParent()：获取上层文件目录路径。若无，返回null
 * public long length()：获取文件长度（即：字节数）。不能获取目录的长度。
 * public long lastModified()：获取最后一次的修改时间，毫秒值
 *
 * 如下的两个方法适用于文件目录：
 * public String[] list()：获取指定目录下的所有文件或者文件目录的名称数组
 * public File[] listFiles()：获取指定目录下的所有文件或者文件目录的File数组
 *
 */
public class FileTest03 {

    @Test
    public void test1(){
        File file1 = new File("hello.txt");

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(new Date(file1.lastModified()));
    }

    @Test
    public void test2(){
        File file = new File("D:\\资料\\后端");

        String[] list = file.list();
        for(String s : list){
            System.out.println(s);
        }

        System.out.println("***************************");

        File[] files = file.listFiles();
        for(File f : files){
            System.out.println(f);
        }
    }

}
