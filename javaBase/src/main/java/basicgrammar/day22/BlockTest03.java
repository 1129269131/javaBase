package basicgrammar.day22;

/**
 * Create by koala on 2020-12-19
 *
 * 类的成员之四：代码块（或初始化块）
 *
 * 1. 代码块的作用：用来初始化类、对象
 * 2. 代码块如果有修饰的话，只能使用static
 * 3. 分类：静态代码块 vs 非静态代码块
 *
 * 4. 静态代码块
 * 	   >内部可以有输出语句
 * 	   >随着类的加载而执行,而且只执行一次
 * 	   >作用：初始化类的信息
 * 	   >如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
 * 	   >静态代码块的执行要优先于非静态代码块的执行
 * 	   >静态代码块内只能调用静态的属性、静态的方法，不能调用非静态的结构
 *
 * 5. 非静态代码块
 * 		>内部可以有输出语句
 * 		>随着对象的创建而执行
 * 		>每创建一个对象，就执行一次非静态代码块
 * 		>作用：可以在创建对象时，对对象的属性等进行初始化
 * 		>如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
 * 		>非静态代码块内可以调用静态的属性、静态的方法，或非静态的属性、非静态的方法
 *
 */
public class BlockTest03 {

    public static void main(String[] args) {
        String desc = Person.desc;
        System.out.println(desc);

        System.out.println("*************");

        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.name);
    }

}

class Person{
    //属性
    String name;

    static String desc = "我是一个人";

    //static代码块
    static {
        System.out.println("static代码块-1");
    }

    static {
        //调用静态结构
        desc = "我是一个爱学习的人";
        info();
        //不能调用非静态结构
		//eat();
		//name = "Tom";
        System.out.println("static代码块-2");
    }

    //非static代码块
    {
        System.out.println("非static代码块-1");
    }

    {
        //调用静态结构
        desc = "我是一个爱学习的人！";
        info();
        //调用非静态结构
        eat();
        name = "Tom";
        System.out.println("非static代码块-2");
    }

    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    public static void info(){
        System.out.println("我是一个快乐的人！");
    }
}
