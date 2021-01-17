package com.koala.javaBase.basicgrammar.day24;

/**
 * Create by koala on 2020-12-20
 *
 * 接口的使用
 * 1.接口使用上也满足多态性
 * 2.接口，实际上就是定义了一种规范
 * 3.开发中，体会面向接口编程！
 *
 */
public class USBTest02 {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Flash flash = new Flash();
        computer.transferData(flash);
    }

}

class Computer{

    public void transferData(USB usb){//USB usb = new Flash();
        usb.start();

        System.out.println("具体传输数据的细节");

        usb.stop();
    }

}

interface USB{

    void start();

    void stop();

}

class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }

}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开启工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }

}
