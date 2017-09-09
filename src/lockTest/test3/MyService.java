package lockTest.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await(){
        lock.lock();
        try{
            System.out.println("线程"+Thread.currentThread().getName()+"进入等待");
            condition.await();
            System.out.println("线程"+Thread.currentThread().getName()+"退出等待");
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void singal(){
        lock.lock();
        condition.signal();
        lock.unlock();

    }



}
