package concurrency;

/**
 * Created by zhujiating on 2017/8/4.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("this is my first Runnable");
    }
}
