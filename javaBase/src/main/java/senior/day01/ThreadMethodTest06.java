package senior.day01;

/**
 * Create by koala on 2020-12-26
 *
 * 9. sleep(long millitime):让当前线程“睡眠”指定的millitime毫秒。在指定的millitime毫秒时间内，当前
 *                          线程是阻塞状态。
 *
 */
public class ThreadMethodTest06 {

    public static void main(String[] args) {
        HelloThread4 h1 = new HelloThread4();
        h1.start();
    }

}

class HelloThread4 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}