package basicgrammar.day14;

/**
 * Create by koala on 2020-12-11
 */
public class Student01 extends Person01 {
    String major;

    public Student01(){

    }

    public Student01(String name,int age,String major){
        this.name = name;
        setAge(age);
        this.major = major;
    }

    public void study(){
        System.out.println("学习");
    }

    public void show(){
        System.out.println("name:" + name + ",age:" + getAge());
    }
}
