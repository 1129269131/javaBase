package com.koala.javaBase.senior.day01;

/**
 * Create by koala on 2020-12-26
 *
 * 线程的优先级：
 * 1.
 * MAX_PRIORITY：10
 * MIN _PRIORITY：1
 * NORM_PRIORITY：5  -->默认优先级
 * 2.如何获取和设置当前线程的优先级：
 *   getPriority():获取线程的优先级
 *   setPriority(int p):设置线程的优先级
 *
 *   说明：高优先级的线程要抢占低优先级线程cpu的执行权。但是只是从概率上讲，高优先级的线程高概率的情况下
 *   被执行。并不意味着只有当高优先级的线程执行完以后，低优先级的线程才执行。
 *
 */
public class ThreadMethodTest07 {

    public static void main(String[] args) {
        HelloThread5 h1 = new HelloThread5();
        h1.setPriority(Thread.MAX_PRIORITY);
        h1.start();

        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("主线程：" + Thread.currentThread().getPriority() + ":" + i);
            }
        }
    }

}

class HelloThread5 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println("分线程：" + getPriority() + ":" + i);
            }
        }
    }
}
