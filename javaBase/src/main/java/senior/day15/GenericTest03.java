package senior.day15;

import org.junit.jupiter.api.Test;

/**
 * Create by koala on 2021-01-07
 *
 * 如何自定义泛型结构：泛型类、泛型接口；泛型方法。
 *
 * 1. 关于自定义泛型类、泛型接口
 *
 */
public class GenericTest03 {

    @Test
    public void test1(){
        //如果定义了泛型类，实例化没有指明类的泛型，则认为此泛型类型为Object类型
        //要求：如果大家定义了类是带泛型的，建议在实例化时要指明类的泛型
        Order03 order = new Order03();
        order.setOrderT(123);
        order.setOrderT("ABC");

        //建议：实例化时指明类的泛型
        Order03<String> order1 = new Order03<>("orderAA",1001,"order:AA");
        order1.setOrderT("AA:hello");
    }

    @Test
    public void test2(){
        SubOrder03_1 sub1 = new SubOrder03_1();
        //由于子类在继承带泛型的父类时，指明了泛型类型。则实例化子类对象时，不再需要指明泛型。
        sub1.setOrderT(1122);

        SubOrder03_2<String> sub2 = new SubOrder03_2<>();
        sub2.setOrderT("order2...");
    }

}
