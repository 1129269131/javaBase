package senior.day13;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by koala on 2021-01-06
 *
 *  Map中定义的方法：
 *
 *   元素查询的操作：
 *   Object get(Object key)：获取指定key对应的value
 *   boolean containsKey(Object key)：是否包含指定的key
 *   boolean containsValue(Object value)：是否包含指定的value
 *   int size()：返回map中key-value对的个数
 *   boolean isEmpty()：判断当前map是否为空
 *   boolean equals(Object obj)：判断当前map和参数对象obj是否相等
 *
 */
public class MapTest04 {

    @Test
    public void test1(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);

        // Object get(Object key)
        System.out.println(map.get(45));

        //containsKey(Object key)
        boolean isExist = map.containsKey("BB");
        System.out.println(isExist);

        //containsValue(Object value)
        isExist = map.containsValue(123);
        System.out.println(isExist);

        System.out.println(map.isEmpty());

        Map map1 = new HashMap();
        map1.put("AA",123);
        map1.put(45,123);
        map1.put("BB",56);
        boolean isEquals = map.equals(map1);
        System.out.println(isEquals);
    }

}
