package basicgrammar.day12_01;

import basicgrammar.day12.Order02;

/**
 * Create by koala on 2020-12-09
 */
public class OrderTest02 {

    public static void main(String[] args) {
        Order02 order = new Order02();

        order.orderPublic = 1;
        //不同包下的普通类（非子类）要使用Order类，不可以调用声明为private、缺省、protected权限的属性、方法
        //order.orderPrivate = 2;
		//order.orderDefault = 3;
		//order.orderProtected = 4;

        order.methodPublic();
        //不同包下的普通类（非子类）要使用Order类，不可以调用声明为private、缺省、protected权限的属性、方法
		//order.methodPrivate();
		//order.methodDefault();
		//order.methodProtected();
    }

}
