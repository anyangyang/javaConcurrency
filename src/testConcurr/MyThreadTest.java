package testConcurr;

import StopThread.YieldMethodTest;
import concurrency.MyRunnable;
import concurrency.MyThread;

/**
 * Created by zhujiating on 2017/8/4.
 */
public class MyThreadTest {

    public static void main(String[] args){

//            MyThread myThread = new MyThread();
//            new Thread(new MyRunnable()).start();
//            myThread.start();
            //System.out.println("current_Thread:"+Thread.currentThread());
        YieldMethodTest yieldMethodTest = new YieldMethodTest();
        yieldMethodTest.start();


    }
}
