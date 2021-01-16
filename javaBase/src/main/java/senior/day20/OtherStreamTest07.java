package senior.day20;

import org.junit.jupiter.api.Test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Create by koala on 2021-01-09
 *
 * 3. 数据流
 *    3.1 DataInputStream 和 DataOutputStream
 *    3.2 作用：用于读取或写出基本数据类型的变量或字符串
 *
 */
public class OtherStreamTest07 {

    //将内存中的字符串、基本数据类型的变量写出到文件中
    @Test
    public void test3() throws IOException {
        //1.
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
        //2.
        dos.writeUTF("张三");
        dos.flush();//刷新操作，将内存中的数据写入文件
        dos.writeInt(23);
        dos.flush();
        dos.writeBoolean(true);
        dos.flush();
        //3.
        dos.close();
    }

    //将文件中存储的基本数据类型变量和字符串读取到内存中，保存在变量中。
    //注意点：读取不同类型的数据的顺序要与当初写入文件时，保存的数据的顺序一致！
    @Test
    public void test4() throws IOException {
        //1.
        DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
        //2.
        String name = dis.readUTF();
        int age = dis.readInt();
        boolean isMale = dis.readBoolean();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("isMale = " + isMale);

        //3.
        dis.close();
    }

}
