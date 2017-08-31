package volatileTest;

/**
 * Created by zhujiating on 2017/8/28.
 */
public class MainMethod {
    public static void main(String[] args) throws InterruptedException{
        OrdinaryTest ordinaryTest = new OrdinaryTest();
        new Thread(ordinaryTest,"a").start();
        Thread.sleep(20000);
        System.out.println("停止线程a");
        ordinaryTest.setContinuePrint(false);
    }
}
