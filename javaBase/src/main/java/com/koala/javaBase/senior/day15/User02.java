package com.koala.javaBase.senior.day15;

/**
 * Create by koala on 2021-01-07
 */
public class User02 implements Comparable<User02>{

    private String name;
    private int age;

    public User02() {
    }

    public User02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //指明泛型时的写法
    @Override
    public int compareTo(User02 o) {
        return this.name.compareTo(o.name);
    }

    //没有指明泛型时的写法
    //按照姓名从大到小排列,年龄从小到大排列
    /*@Override
    public int compareTo(Object o) {
        if(o instanceof User02){
            User02 user = (User02)o;
            int compare = -this.name.compareTo(user.name);
            if(compare != 0){
                return compare;
            }else{
                return Integer.compare(this.age,user.age);
            }
        }else{
            throw new RuntimeException("输入的类型不匹配");
        }
    }*/

}
