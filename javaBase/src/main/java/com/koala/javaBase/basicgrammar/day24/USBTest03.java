package com.koala.javaBase.basicgrammar.day24;

/**
 * Create by koala on 2020-12-20
 */
public class USBTest03 {

    public static void main(String[] args) {
        Computer computer = new Computer();

        //1.创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        computer.transferData(flash);

        //2. 创建了接口的非匿名实现类的匿名对象
        computer.transferData(new Printer());

        //3. 创建了接口的匿名实现类的非匿名对象
        USB phone = new USB(){

            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }

        };
        computer.transferData(phone);

        //4. 创建了接口的匿名实现类的匿名对象
        computer.transferData(new USB(){

            @Override
            public void start() {
                System.out.println("mp3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("mp3结束工作");
            }
        });
    }

}
