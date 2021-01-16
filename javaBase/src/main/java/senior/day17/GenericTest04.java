package senior.day17;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by koala on 2021-01-08
 *
 * 有限制条件的通配符的使用。
 * （-∞，+∞）
 * ? extends A:
 *    G<? extends A> 可以作为G<A>和G<B>的父类，其中B是A的子类（-∞，A]
 *
 * ? super A:
 *    G<? super A> 可以作为G<A>和G<B>的子类，其中B是A的父类 [A，+∞）
 *
 */
public class GenericTest04 {

    @Test
    public void test4(){
        List<? extends Person04> list1 = null;
        List<? super Person04> list2 = null;

        List<Student04> list3 = new ArrayList<>();
        List<Person04> list4 = new ArrayList<>();
        List<Object> list5 = new ArrayList<>();

        list1 = list3;
        list1 = list4;
        //list1 = list5;

        //list2 = list3;
        list2 = list4;
        list2 = list5;

        //读取数据：
        list1 = list3;
        Person04 p = list1.get(0);
        //编译不通过
        //Student s = list1.get(0);

        list2 = list4;
        Object obj = list2.get(0);
        ////编译不通过
        //Person obj = list2.get(0);

        //写入数据：
        //编译不通过
        //list1.add(new Student04());

        //编译通过
        list2.add(new Person04());
        list2.add(new Student04());
    }

}
