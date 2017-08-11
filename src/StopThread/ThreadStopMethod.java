package StopThread;

/**
 * Created by zhujiating on 2017/8/9.
 */
public class ThreadStopMethod extends Thread {
    @Override
    public void run() {
        try{
            for(int i=0;i<50000;i++){
                System.out.println("i="+ i);
                this.sleep(1000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
