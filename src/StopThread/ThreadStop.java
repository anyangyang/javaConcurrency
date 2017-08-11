package StopThread;

/**
 * Created by zhujiating on 2017/8/8.
 */
public class ThreadStop extends Thread{
    @Override
    public void run(){
        try{
            for(int i=0;i<50000;i++){
                // 为了中断线程，需要在这里检测当前线程的中断信息
                if(this.interrupted()){
                    System.out.println("线程中断");
                    //throw new InterruptedException();
                    // break;
                    return;
                }
                System.out.println("i="+ (i+1));
            }
            this.sleep(50);
            System.out.println("退出了for循环，但是执行到这里，线程还未中断");
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
