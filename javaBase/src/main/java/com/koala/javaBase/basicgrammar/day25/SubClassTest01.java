package com.koala.javaBase.basicgrammar.day25;

/**
 * Create by koala on 2020-12-20
 */
public class SubClassTest01 {

    public static void main(String[] args) {

        SubClass1 s1 = new SubClass1();
        //s.method1();
        //SubClass.method1();

        //知识点1：接口中定义的静态方法，只能通过接口来调用
        CompareA01.method1();

        //知识点2：通过实现类的对象，可以调用接口中的默认方法
        //如果实现类重写了接口中的默认方法，调用时，仍然调用的是重写以后的方法
        s1.method2();

        //知识点3：如果子类(或实现类)继承的父类和实现的接口中声明了同名同参数的默认方法，
        //那么子类在没有重写此方法的情况下，默认调用的是父类中的同名同参数的方法。-->类优先原则
        s1.method3();

        //知识点4：如果实现类实现了多个接口，而这多个接口中定义了同名同参数的默认方法，
        //那么在实现类没有重写此方法的情况下，报错。-->接口冲突。
        //这就需要我们必须在实现类中重写此方法
        SubClass2 s2 = new SubClass2();
        s2.method3();

    }

}

class SubClass1 extends SuperClass01 implements CompareA01{

    @Override
    public void method2() {
        System.out.println("SubClass1：上海");
    }

    //知识点5：如何在子类(或实现类)的方法中调用父类、接口中被重写的方法
    public void myMethod(){
        method2();//调用自己定义的重写的方法
        super.method3();//调用的是父类中声明的
        CompareA01.super.method3();//调用接口中的默认方法
    }
}

class SubClass2 implements CompareA01,CompareB01{

    @Override
    public void method3(){
        System.out.println("SubClass2：深圳");
    }

}
