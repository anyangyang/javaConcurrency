package concurrency;

/**
 * Created by zhujiating on 2017/8/4.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("current_Runnable_Thread:"+Thread.currentThread().getId());
    }
}
