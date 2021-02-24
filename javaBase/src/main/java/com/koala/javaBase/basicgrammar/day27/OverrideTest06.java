package com.koala.javaBase.basicgrammar.day27;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Create by koala on 2020-12-26
 *
 * 方法重写的规则之一：
 *  子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 *
 */
public class OverrideTest06 {

    public static void main(String[] args) {
        OverrideTest06 test = new OverrideTest06();
        test.display(new SubClass());
    }

    public void display(SuperClass s){
        try {
            s.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class SuperClass{

    public void method() throws IOException {

    }

}

class SubClass extends SuperClass{
    @Override
    public void method()throws FileNotFoundException {

    }
}
