package senior.day01;

/**
 * Create by koala on 2020-12-26
 *
 * 6. yield():释放当前cpu的执行权
 *
 */
public class ThreadMethodTest04 {

    public static void main(String[] args) {
        HelloThread2 h1 = new HelloThread2();
        h1.start();

        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }

}

class HelloThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

            if(i % 20 == 0){
                yield();
            }

        }
    }
}