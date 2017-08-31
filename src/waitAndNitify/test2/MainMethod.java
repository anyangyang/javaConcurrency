package waitAndNitify.test2;

/**
 * Created by zhujiating on 2017/8/30.
 */
public class MainMethod {
    public static void main(String[] args)throws InterruptedException{
        String lock = "a";
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        SubThread subThread = new SubThread(subtract);
        subThread.start();
        SubThread subThread1 = new SubThread(subtract);
        subThread1.start();
        AddThread addThread = new AddThread(add);
        Thread.sleep(2000);
        addThread.start();
    }
}
