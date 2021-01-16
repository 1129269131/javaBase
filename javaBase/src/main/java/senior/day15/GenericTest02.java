package senior.day15;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Create by koala on 2021-01-07
 */
public class GenericTest02 {

    //自然排序
    @Test
    public void test1() {
        TreeSet<User02> set = new TreeSet<>();
        User02 u1 = new User02("Tom", 23);
        User02 u2 = new User02("Jerry", 32);
        User02 u3 = new User02("Jack", 20);
        User02 u4 = new User02("Rose", 18);

        set.add(u1);
        set.add(u2);
        set.add(u3);
        set.add(u4);

        Iterator<User02> iterator = set.iterator();
        while (iterator.hasNext()) {
            User02 user = iterator.next();
            System.out.println(user);
        }
    }

    @Test
    public void test2() {
        //使用泛型以后的写法
        Comparator<User02> com = new Comparator<User02>() {
            //按照年龄从小到大排列
            @Override
            public int compare(User02 o1, User02 o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        //使用泛型之前的写法
        /*Comparator com = new Comparator() {
            //按照年龄从小到大排列
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User02 && o2 instanceof User02) {
                    User02 u1 = (User02) o1;
                    User02 u2 = (User02) o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                } else {
                    throw new RuntimeException("输入的数据类型不匹配");
                }
            }
        };*/

        TreeSet<User02> set = new TreeSet<>(com);
        set.add(new User02("Tom", 12));
        set.add(new User02("Jerry", 32));
        set.add(new User02("Jim", 2));
        set.add(new User02("Mike", 65));
        set.add(new User02("Mary", 33));
        set.add(new User02("Jack", 33));
        set.add(new User02("Jack", 56));

        Iterator<User02> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
