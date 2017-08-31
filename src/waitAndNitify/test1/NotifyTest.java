package waitAndNitify.test1;

/**
 * Created by zhujiating on 2017/8/30.
 */
public class NotifyTest extends Thread{
    @Override
    public void run() {
        synchronized (WaitTest.waitTest){
            System.out.println("开始进入 notify（）");
            WaitTest.waitTest .notify();
            System.out.println("notify（）结束");
        }
    }

    /**
     * Created by zhujiating on 2017/8/29.
     */
    public static class WaitTest extends Thread{
        public static WaitTest waitTest = new WaitTest();


        @Override
        public void run() {
            synchronized (waitTest){
                System.out.println("开始进入 wait（）:"+System.currentTimeMillis());
                try{
                    waitTest.wait(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("wait（）结束:"+System.currentTimeMillis());
            }

        }

        public static void main(String[] args) throws InterruptedException{
    //        System.out.println("开始进入 wait（）");
    //    // waitTest.wait();
    //        waitTest.notify();
    //        System.out.println("wait（）结束");
    //        WaitTest waitTest = new WaitTest();
    //        waitTest.start();
    //        NotifyTest notifyTest = new NotifyTest();
    //        Thread.sleep(2000);
    //        notifyTest.start();
            WaitTest waitTest = new WaitTest();
            waitTest.start();
        }
    }
}
