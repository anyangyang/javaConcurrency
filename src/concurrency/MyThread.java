package concurrency;

/**
 * Created by zhujiating on 2017/8/4.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("this is my thread");
    }
}
