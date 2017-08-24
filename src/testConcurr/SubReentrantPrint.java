package testConcurr;

/**
 * Created by zhujiating on 2017/8/21.
 */
public class SubReentrantPrint extends ReentrantPrint {

    public synchronized void subMethod(){
        try{
            while(i>0){
                System.out.println("sub:"+i);
                i--;
                Thread.sleep(2000);
                mainMethod();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
