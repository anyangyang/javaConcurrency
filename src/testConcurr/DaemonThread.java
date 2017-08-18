package testConcurr;

/**
 * Created by zhujiating on 2017/8/16.
 */
public class DaemonThread extends Thread {
    private int counter = 0;
    @Override
    public void run() {
        while(true){
            try{
                System.out.println("线程"+Thread.currentThread().getName()+":"+ counter++);
                this.sleep(1000);

            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }


    }
    public static void main(String[] args) throws InterruptedException{
        DaemonThread  daemonThread = new DaemonThread();
        daemonThread.setName("A");
        daemonThread.setDaemon(true);    // 设置该线程为守护线程
        daemonThread.start();
        Thread.sleep(1000);


        System.out.println("线程"+Thread.currentThread().getName()+"退出");

    }
}
