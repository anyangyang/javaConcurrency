package lockTest.test6;

import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private ReentrantLock lock = new ReentrantLock(true);    // 公平锁


    public void methodA()throws InterruptedException{
        lock.lock();   // 获取锁
        System.out.println("methodA is going start:"+Thread.currentThread().getName()+" HoldCount:"+lock.getHoldCount());
        Thread.sleep(1000);
        methodB();
        //释放锁
        lock.unlock();
    }


    public void methodB()throws InterruptedException{
        lock.lock();   // 获取锁
        System.out.println("methodA is going start:"+Thread.currentThread().getName()+" HoldCount:"+lock.getHoldCount());
        Thread.sleep(1000);
        //释放锁
        lock.unlock();
    }
}
