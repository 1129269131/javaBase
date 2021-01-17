package com.koala.javaBase.basicgrammar.day19;

/**
 * Create by koala on 2020-12-19
 *
 * Object类中toString()的使用：
 *
 * 1. 当我们输出一个对象的引用时，实际上就是调用当前对象的toString()
 *
 * 2. Object类中toString()的定义：
 *   public String toString() {
 *       return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *   }
 *
 * 3. 像String、Date、File、包装类等都重写了Object类中的toString()方法，
 *    使得在调用对象的toString()时，返回"实体内容"信息
 *
 * 4. 自定义类也可以重写toString()方法，当调用此方法时，返回对象的"实体内容"
 *
 */
public class ToStringTest03 {

    public static void main(String[] args) {
        Customer02 cust = new Customer02("Tom");
        System.out.println(cust.toString());//basicgrammar.day19.Customer02@4f47d24
        System.out.println(cust);//basicgrammar.day19.Customer02@4f47d24

        System.out.println("******************");

        String str = new String("MM");
        System.out.println(str);//MM

        System.out.println("******************");

        RewriteToString03 rw = new RewriteToString03("Tom");
        System.out.println(rw.toString());//RewriteToString03{name='Tom'}
        System.out.println(rw);//RewriteToString03{name='Tom'}
    }

}
