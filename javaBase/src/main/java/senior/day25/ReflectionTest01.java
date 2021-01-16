package senior.day25;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Create by koala on 2021-01-10
 *
 * 反射
 *
 * 疑问1：通过直接new的方式或反射的方式都可以调用公共的结构，开发中到底用那个？
 * 建议：直接new的方式
 * 什么时候会使用：反射的方式。 反射的特征：动态性
 * 疑问2：反射机制与面向对象中的封装性是不是矛盾的？如何看待两个技术？
 * 不矛盾。
 *
 */
public class ReflectionTest01 {

    //反射之前，对于Person01的操作
    @Test
    public void test1() {
        //1.创建Person类的对象
        Person01 p1 = new Person01("Tom", 12);

        //2.通过对象，调用其内部的属性、方法
        p1.age = 10;
        System.out.println(p1.toString());

        p1.show();

        //在Person01类外部，不可以通过Person01类的对象调用其内部私有结构。
        //比如：name、showNation()以及私有的构造器
    }

    //反射之后，对于Person01的操作
    @Test
    public void test2() throws Exception{
        Class clazz = Person01.class;

        //1.通过反射，创建Person类的对象
        Constructor cons = clazz.getConstructor(String.class,int.class);
        Object obj = cons.newInstance("Tom",12);
        Person01 p = (Person01) obj;
        System.out.println(p.toString());

        //2.通过反射，调用对象指定的属性、方法
        //调用属性
        Field age = clazz.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p.toString());

        //调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        System.out.println("********************************");

        //通过反射，可以调用Person01类的私有结构的。比如：私有的构造器、方法、属性
        //调用私有的构造器
        Constructor cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person01 p1 = (Person01) cons1.newInstance("Jerry");
        System.out.println(p1);

        //调用私有的属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"HanMeimei");
        System.out.println(p1);

        //调用私有的方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String nation = (String) showNation.invoke(p1,"中国");//相当于String nation = p1.showNation("中国")
        System.out.println(nation);
    }

}
