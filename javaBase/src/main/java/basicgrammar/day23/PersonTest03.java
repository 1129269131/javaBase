package basicgrammar.day23;

/**
 * Create by koala on 2020-12-20
 *
 * 抽象类的匿名子类
 *
 */
public class PersonTest03 {

    public static void main(String[] args) {
        Worker worker = new Worker();
        method(worker);//非匿名的类非匿名的对象

        method(new Worker());//非匿名的类匿名的对象

        System.out.println("*********************");

        //创建了一匿名子类的对象：p
        Person1 p = new Person1() {
            @Override
            public void say() {
                System.out.println("创建了一匿名子类的对象：p");
            }
        };
        method(p);

        System.out.println("*********************");

        //创建匿名子类的匿名对象
        method(new Person1() {
            @Override
            public void say() {
                System.out.println("创建匿名子类的匿名对象");
            }
        });
    }

    public static void method(Person1 p){
        p.say();
    }

}

abstract class Person1{

    //抽象方法
    public abstract void say();

}

class Worker extends Person1{

    @Override
    public void say() {
    }


}