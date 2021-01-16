package basicgrammar.day18;

/**
 * Create by koala on 2020-12-17
 *
 */
public class PersonTest01 {

    public static void main(String[] args) {
        //不能调用子类所特有的方法、属性：编译时，p是Person类型
        //有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法的，但是由于变量声明为父类类型，导致
        //编译时，只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用。
        Person01 p = new Man01();
        p.id = 1005;
        //p.earnMoney();
        //p.isSmoking = true;

        System.out.println("******************");

        //如何才能调用子类特有的属性和方法？
        //向下转型：使用强制类型转换符
        Man01 m = (Man01)p;
        m.earnMoney();
        m.isSmoking = true;

        System.out.println("******************");

        //使用强转时，可能出现ClassCastException的异常
        //Woman01 w = (Woman01)p;
        //w.eat();

        System.out.println("******************");

        /*
         * instanceof关键字的使用
         *
         * a instanceof A:判断对象a是否是类A的实例。如果是，返回true；如果不是，返回false。
         *
         *
         *  使用情境：为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先
         *  进行instanceof的判断，一旦返回true，就进行向下转型。如果返回false，不进行向下转型。
         *
         *  如果 a instanceof A返回true,则 a instanceof B也返回true
         *  其中，类B是类A的父类
         *
         */
        if(p instanceof Woman01){
            Woman01 w1 = (Woman01)p;
            w1.goShopping();
            System.out.println("******Woman******");
        }

        if(p instanceof Man01){
            Man01 m1 = (Man01)p;
            m1.earnMoney();
            System.out.println("******Man******");
        }
        if(p instanceof Person01){
            System.out.println("******Person******");
        }
        if(p instanceof Object){
            System.out.println("******Object******");
        }
    }

}
