package senior.day17;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by koala on 2021-01-08
 */
public class GenericTest03 {

    @Test
    public void test1(){
        List<?> list = null;

        List<String> list1 = new ArrayList<>();
        list1.add("AA");
        list1.add("BB");
        list1.add("CC");
        list = list1;
        //添加(写入)：对于List<?>就不能向其内部添加数据
        //除了添加null之外
        //list.add("DD");
        list.add(null);

        //获取(读取)：允许读取数据，读取的数据类型为Object
        Object o = list.get(0);
        System.out.println(o);
    }

}
