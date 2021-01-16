package basicgrammar.day10;

/**
 * Create by koala on 2020-12-08
 *
 * 匿名对象的使用:
 * 1.理解：我们创建的对象，没有显式的赋给一个变量名，即为匿名对象
 * 2.特征：匿名对象只能调用一次
 *
 */
public class InstanceTest05 {

    public static void main(String[] args) {
        //匿名对象
        new Phone().price = 1999;
        new Phone().showPrice();//0.0

        //匿名对象的使用
        PhoneMall mall = new PhoneMall();
        mall.show(new Phone());
    }

}

class Phone{
    double price;//价格

    public void sendEmail(){
        System.out.println("发送邮件");
    }

    public void playGame(){
        System.out.println("玩游戏");
    }

    public void showPrice(){
        System.out.println("手机的价格为：" + price);
    }
}

class PhoneMall{

    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }

}