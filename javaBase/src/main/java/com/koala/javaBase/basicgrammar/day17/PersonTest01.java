package com.koala.javaBase.basicgrammar.day17;

/**
 * Create by koala on 2020-12-17
 *
 * 面向对象特征之三：多态性
 *
 * 1.理解多态性：可以理解为一个事物的多种形态
 * 2.何为多态性：
 *   对象的多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）
 *
 * 3. 多态的使用：虚拟方法调用
 *   有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法。
 *   总结：编译，看左边；运行，看右边。
 *
 * 4.多态性的使用前提： ① 类的继承关系  ② 方法的重写
 *
 * 5.对象的多态性，只适用于方法，不适用于属性（属性：编译和运行都看左边）
 *
 */
public class PersonTest01 {

    public static void main(String[] args) {
        //对象的多态性：父类的引用指向子类的对象
        Person01 p = new Man01();
        p.eat();

        System.out.println("*****************");
        System.out.println(p.id);
    }

}
