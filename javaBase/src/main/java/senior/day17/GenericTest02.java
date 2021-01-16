package senior.day17;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Create by koala on 2021-01-08
 *
 * 2. 通配符的使用
 * 通配符：?
 * 类A是类B的父类，G<A>和G<B>是没有关系的，二者共同的父类是：G<?>
 *
 */
public class GenericTest02 {

    @Test
    public void test3(){
        List<Object> list1 = null;
        List<String> list2 = null;

        List<?> list = null;

        list = list1;
        list = list2;

        print(list1);
        print(list2);
    }

    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }

}
