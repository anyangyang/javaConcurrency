package StopThread;

/**
 * Created by zhujiating on 2017/8/9.
 */
public class ThreadStopTwo extends Thread {
    @Override
    public void run() {
        try{
            for(int i=0;i<50000;i++){
                System.out.println("i="+(i+1));
            }
            System.out.println("begin");
            this.sleep(20000);
            System.out.println("finish");
        }catch(InterruptedException e){
            System.out.println("线程在睡眠中进入异常 isInterrupt："+this.isInterrupted());
            e.printStackTrace();
        }

    }
}
