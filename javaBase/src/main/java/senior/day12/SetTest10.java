package senior.day12;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Create by koala on 2021-01-04
 *
 * 1.向TreeSet中添加的数据，要求是相同类的对象
 * 2.两种排序方式：自然排序（实现Comparable接口）和 定制排序（Comparator）
 * 3.自然排序中，比较两个对象是否相同的标准为：compareTo()返回0.不再是equals().
 * 4.定制排序中，比较两个对象是否相同的标准为：compare()返回0.不再是equals().
 *
 */
public class SetTest10 {

    @Test
    public void test1(){
        TreeSet set = new TreeSet();

        set.add(new User10("Tom",12));
        set.add(new User10("Jerry",32));
        set.add(new User10("Jim",2));
        set.add(new User10("Mike",65));
        set.add(new User10("Jack",33));
        set.add(new User10("Jack",56));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
        Comparator com = new Comparator() {
            //按照年龄从小到大排列
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User10 && o2 instanceof User10){
                    User10 u1 = (User10)o1;
                    User10 u2 = (User10)o2;
                    return Integer.compare(u1.getAge(),u2.getAge());
                }else{
                    throw new RuntimeException("输入的数据类型不匹配");
                }
            }
        };

        TreeSet set = new TreeSet(com);
        set.add(new User10("Tom",12));
        set.add(new User10("Jerry",32));
        set.add(new User10("Jim",2));
        set.add(new User10("Mike",65));
        set.add(new User10("Mary",33));
        set.add(new User10("Jack",33));
        set.add(new User10("Jack",56));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
