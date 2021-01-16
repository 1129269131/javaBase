package basicgrammar.day12;

/**
 * Create by koala on 2020-12-10
 *
 * 总结：属性赋值的先后顺序
 *
 * ① 默认初始化
 * ② 显式初始化
 * ③ 构造器中初始化
 *
 * ④ 通过"对象.方法" 或 "对象.属性"的方式，赋值
 *
 * 以上操作的先后顺序：① - ② - ③ - ④
 *
 */
public class UserTest04 {

    public static void main(String[] args) {
        User u = new User();
        System.out.println(u.age);

        User u1 = new User(2);
        u1.setAge(3);
        System.out.println(u1.age);
    }

}

class User{
    String name;
    int age = 1;

    public User(){

    }

    public User(int a){
        age = a;
    }

    public void setAge(int a){
        age = a;
    }
}
