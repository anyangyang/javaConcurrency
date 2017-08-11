package StopThread;

/**
 * Created by zhujiating on 2017/8/11.
 */
public class YieldMethodTest extends Thread {
    @Override
    public void run() {
        long currentTime = System.currentTimeMillis();
        for(int i=0;i<5000000;i++){
           // Thread.yield();
            System.out.println("i="+i);
        }
        System.out.println("总共花费："+ (System.currentTimeMillis()-currentTime));
    }
}
