package senior.day13;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Create by koala on 2021-01-06
 *
 * TreeMap：
 * 向TreeMap中添加key-value，要求key必须是由同一个类创建的对象
 * 因为要按照key进行排序：自然排序 、定制排序
 *
 */
public class TreeMapTest06 {

    //自然排序
    @Test
    public void test1(){
        TreeMap map = new TreeMap();
        User06 u1 = new User06("Tom",23);
        User06 u2 = new User06("Jerry",32);
        User06 u3 = new User06("Jack",20);
        User06 u4 = new User06("Rose",18);

        map.put(u1,98);
        map.put(u2,89);
        map.put(u3,76);
        map.put(u4,100);

        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
            Object obj = iterator1.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "---->" + entry.getValue());
        }
    }

    //定制排序
    @Test
    public void test2(){
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User06 && o2 instanceof User06){
                    User06 u1 = (User06)o1;
                    User06 u2 = (User06)o2;
                    return Integer.compare(u1.getAge(),u2.getAge());
                }
                throw new RuntimeException("输入的类型不匹配！");
            }
        });
        User06 u1 = new User06("Tom",23);
        User06 u2 = new User06("Jerry",32);
        User06 u3 = new User06("Jack",20);
        User06 u4 = new User06("Rose",18);

        map.put(u1,98);
        map.put(u2,89);
        map.put(u3,76);
        map.put(u4,100);

        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
            Object obj = iterator1.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "---->" + entry.getValue());
        }
    }

}
