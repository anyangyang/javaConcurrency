package testConcurr;

/**
 * Created by zhujiating on 2017/8/21.
 */
public class ReentrantPrint {

    protected int i = 10;

    public synchronized  void mainMethod(){
        try{
            System.out.println("main:"+i);
            i--;
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public synchronized void printA(){
        System.out.println("线程"+Thread.currentThread().getName()+":printA");
        printB();
    }

    public synchronized void printB(){
        System.out.println("线程"+Thread.currentThread().getName()+":printB");
        printC();
    }

    public synchronized void printC(){
        System.out.println("线程"+Thread.currentThread().getName()+":printC");
    }
}
