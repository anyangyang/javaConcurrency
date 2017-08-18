package testConcurr;

import StopThread.YieldMethodTest;
import concurrency.MyRunnable;
import concurrency.MyThread;

/**
 * Created by zhujiating on 2017/8/4.
 */
public class MyThreadTest {

    public static void main(String[] args) throws InterruptedException{

//            MyThread myThread = new MyThread();
//            new Thread(new MyRunnable()).start();
//            myThread.start();
            //System.out.println("current_Thread:"+Thread.currentThread());
//        YieldMethodTest yieldMethodTest = new YieldMethodTest();
//        yieldMethodTest.start();

//        Thread thread1 = new Thread(){
//            private int counter = 0;
//
//            public int getCounter() {
//                return counter;
//            }
//
//            @Override
//            public void run() {
//
//                //for(int i=0;i<5000000;i++){
//                while(true){
//                    counter++;
//                    //System.out.println("线程"+Thread.currentThread().getName());
//                    // Thread.yield();
//                }
//            }
//        };
//        thread1.setName("A");
//        thread1.setPriority(5);
//
//        Thread thread2 = new Thread(){
//            private int count = 0;
//
//            public int getCount() {
//                return count;
//            }
//            @Override
//            public void run() {
//           //     for(int i=0;i<5000000;i++){
//                while(true){
//                    count++;
//                    //System.out.println("线程"+Thread.currentThread().getName());
//                   // System.out.println("线程"+Thread.currentThread().getName()+":"+i);
//                    //Thread.yield();
//                }
//
//
//
//            }
//        };
//        thread2.setName("B");
//        thread2.setPriority(6);
//
//        thread1.start();
//        thread2.start();



//        Thread thread = new Thread(){
//            @Override
//            public void run() {
//                System.out.println("线程"+Thread.currentThread().getName()+"的优先级："+Thread.currentThread().getPriority());
//                // 打开一个线程
//                Thread thread1 = new Thread(){
//                    @Override
//                    public void run() {
//                        System.out.println("线程"+Thread.currentThread().getName()+"的优先级："+Thread.currentThread().getPriority());
//                    }
//                };
//                // 这里可以给线程B设置一下优先级
//                thread1.setPriority(7);
//                thread1.setName("B");
//                thread1.start();
//            }
//        };
//        thread.setName("A");
//        // 如果不给线程A设置优先级的话，A就是默认优先级5，看不出什么效果
//        thread.setPriority(6);
//        thread.start();
//        System.out.println("线程"+Thread.currentThread().getName()+"的优先级："+Thread.currentThread().getPriority());

        TestPriority testPriority = new TestPriority();
        testPriority.setPriority(5);
        testPriority.setName("A");
        TestPriority2 testPriority2 = new TestPriority2();
        testPriority2.setPriority(5);
        testPriority2.setName("B");

        testPriority.start();
        testPriority2.start();

        Thread.sleep(2000);

        testPriority.stop();
        testPriority2.stop();

        System.out.println("线程"+testPriority.getName()+":"+testPriority.getCounter());
        System.out.println("线程"+testPriority2.getName()+":"+testPriority2.getCounter());



    }
}
