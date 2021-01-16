package senior.day18;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * Create by koala on 2021-01-08
 *
 * 创建硬盘中对应的文件或文件目录
 * public boolean createNewFile()：创建文件。若文件存在，则不创建，返回false
 * public boolean mkdir()：创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上层目录不存在，也不创建。
 * public boolean mkdirs()：创建文件目录。如果此文件目录存在，就不创建了。如果上层文件目录不存在，一并创建
 *
 * 删除磁盘中的文件或文件目录
 * public boolean delete()：删除文件或者文件夹
 *     删除注意事项：Java中的删除不走回收站。
 *
 */
public class FileTest06 {

    @Test
    public void test1() throws IOException {
        File file1 = new File("hi.txt");
        if(!file1.exists()){
            //文件的创建
            file1.createNewFile();
            System.out.println("创建成功");
        }else{//文件存在
            file1.delete();
            System.out.println("删除成功");
        }
    }

    @Test
    public void test2(){
        //文件目录的创建
        File file1 = new File("d:\\io\\io1\\io3");

        boolean mkdir = file1.mkdir();
        if(mkdir){
            System.out.println("创建成功1");
        }

        File file2 = new File("d:\\io\\io1\\io4");

        boolean mkdir1 = file2.mkdirs();
        if(mkdir1){
            System.out.println("创建成功2");
        }

        //要想删除成功，io4文件目录下不能有子目录或文件
        File file3 = new File("D:\\io\\io1\\io4");
        System.out.println(file3.delete());
    }

}
