package lockTest.test5;

import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private ReentrantLock lock = new ReentrantLock(true);    // 公平锁


    public void methodA()throws InterruptedException{
        lock.lock();   // 获取锁
        System.out.println("methodA is going start:"+Thread.currentThread().getName()+" currentTime:"+System.currentTimeMillis());
        Thread.sleep(1000);
        System.out.println("methodA is finished:"+Thread.currentThread().getName()+" currentTime:"+System.currentTimeMillis());
        methodB();
        //释放锁
        lock.unlock();
    }


    public void methodB()throws InterruptedException{
        lock.lock();   // 获取锁
        System.out.println("methodB is going start:"+Thread.currentThread().getName()+" currentTime:"+System.currentTimeMillis());
        Thread.sleep(1000);
        System.out.println("methodB is finished:"+Thread.currentThread().getName()+" currentTime:"+System.currentTimeMillis());

        //释放锁
        lock.unlock();
    }
}
