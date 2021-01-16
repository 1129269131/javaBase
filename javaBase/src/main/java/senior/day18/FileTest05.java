package senior.day18;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * Create by koala on 2021-01-08
 *
 * public boolean isDirectory()：判断是否是文件目录
 * public boolean isFile()：判断是否是文件
 * public boolean exists()：判断是否存在
 * public boolean canRead()：判断是否可读
 * public boolean canWrite()：判断是否可写
 * public boolean isHidden()：判断是否隐藏
 *
 */
public class FileTest05 {

    @Test
    public void test1(){
        File file1 = new File("hello.txt");

        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
    }

}
