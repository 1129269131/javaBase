package senior.day27;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Create by koala on 2021-01-11
 *
 * 动态代理与AOP
 *
 */
public class ProxyTest03 {

    public static void main(String[] args) {
        SuperMan1 superMan = new SuperMan1();
        //proxyInstance:代理类的对象
        Human1 proxyInstance = (Human1) ProxyFactory1.getProxyInstance(superMan);
        //当通过代理类对象调用方法时，会自动的调用被代理类中同名的方法
        String belief = proxyInstance.getBelief();
        System.out.println(belief);
        proxyInstance.eat("四川麻辣烫");
    }

}

interface Human1{

    String getBelief();

    void eat(String food);

}

//被代理类
class SuperMan1 implements Human1{

    @Override
    public String getBelief() {
        return "I believe I can fly!";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }
}

class ProxyFactory1{
    //调用此方法，返回一个代理类的对象。解决问题一
    public static Object getProxyInstance(Object obj){//obj:被代理类的对象
        MyInvocationHandler1 handler = new MyInvocationHandler1();

        handler.bind(obj);

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);
    }
}

class MyInvocationHandler1 implements InvocationHandler {
    private Object obj;//需要使用被代理类的对象进行赋值

    public void bind(Object obj){
        this.obj = obj;
    }

    //当我们通过代理类的对象，调用方法a时，就会自动的调用如下的方法：invoke()
    //将被代理类要执行的方法a的功能就声明在invoke()中
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        HumanUtil util = new HumanUtil();
        util.method1();

        //method:即为代理类对象调用的方法，此方法也就作为了被代理类对象要调用的方法
        //obj:被代理类的对象
        Object returnValue = method.invoke(obj,args);
        //上述方法的返回值就作为当前类中的invoke()的返回值。

        util.method2();
        return returnValue;
    }

}

class HumanUtil{

    public void method1(){
        System.out.println("====================通用方法一====================");
    }

    public void method2(){
        System.out.println("====================通用方法二====================");
    }

}