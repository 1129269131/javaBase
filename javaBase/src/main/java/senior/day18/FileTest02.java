package senior.day18;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * Create by koala on 2021-01-08
 *
 * 1.如何创建File类的实例
 *         File(String filePath)
 *         File(String parentPath,String childPath)
 *         File(File parentFile,String childPath)
 *
 * 2.
 * 相对路径：相较于某个路径下，指明的路径
 * 绝对路径：包含盘符在内的文件或文件目录的路径
 *
 * 3.路径分隔符
 * windows:\\
 * unix:/
 *
 */
public class FileTest02 {

    @Test
    public void test1(){
        //构造器1
        File file1 = new File("hello.txt");//相对于当前module
        File file2 =  new File("D:\\workspace_idea1\\JavaSenior\\day08\\he.txt");

        System.out.println(file1);
        System.out.println(file2);

        //构造器2：
        File file3 = new File("D:\\workspace_idea1","JavaSenior");
        System.out.println(file3);

        //构造器3：
        File file4 = new File(file3,"hi.txt");
        System.out.println(file4);
    }

}
