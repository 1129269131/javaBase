package senior.day15;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Create by koala on 2021-01-07
 */
public class GenericTest05 {

    //泛型方法
    @Test
    public void test1(){
        Order05<String> order = new Order05<>();
        Integer[] arr = new Integer[]{1,2,3,4};
        //泛型方法在调用时，指明泛型参数的类型。
        List<Integer> list = order.copyFromArrayToList(arr);

        System.out.println(list);
    }

}
