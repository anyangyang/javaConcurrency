package volatileTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zhujiating on 2017/8/28.
 */
public class OrdinaryTest implements Runnable{

    private Boolean isContinuePrint = true;

    public volatile int i;




    public Boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(Boolean continuePrint) {
        isContinuePrint = continuePrint;
    }

    public void printStringMethod() throws InterruptedException{

        while(isContinuePrint == true){
            System.out.println("run printStringMethod thread:"+Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }

    @Override
    public void run() {
        try{
            printStringMethod();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
