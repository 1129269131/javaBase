package com.koala.javaBase.basicgrammar.day12_01;

import com.koala.javaBase.basicgrammar.day12.Order02;

/**
 * Create by koala on 2020-12-15
 */
public class SubOrder02 extends Order02 {

    public void method(){
        orderProtected = 1;
        orderPublic = 2;

        methodProtected();
        methodPublic();

        //在不同包的子类中，不能调用Order类中声明为private和缺省权限的属性、方法
		//orderDefault = 3;
		//orderPrivate = 4;

		//methodDefault();
		//methodPrivate();
    }

}
