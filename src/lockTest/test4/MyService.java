package lockTest.test4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private ReentrantLock lock= new ReentrantLock();
    private Condition condition = lock.newCondition();
    private List<Date> list = new ArrayList();

    public void put()throws InterruptedException{
        // 首先获取lock
        lock.lock();
        while(list.size() == 1){
            System.out.println("线程"+Thread.currentThread().getName()+"进入await");
            condition.await();
            System.out.println("线程"+Thread.currentThread().getName()+"退出await");
        }
        // 如果 list 为空，就向 list 放入一个产品

        list.add(new Date());
        // 然后唤醒一个消费者来消费
        System.out.println("线程"+Thread.currentThread().getName()+"生产了一个产品:"+list.get(list.size()-1));
        condition.signalAll();
        lock.unlock();

    }

    public void pop()throws InterruptedException{
        lock.lock();
        while(list.size() == 0){
            System.out.println("线程"+Thread.currentThread().getName()+"进入await");
            condition.await();
            System.out.println("线程"+Thread.currentThread().getName()+"退出await");
        }

        System.out.println("线程"+Thread.currentThread().getName()+"消费一个产品:"+list.get(list.size()-1));
        list.remove(list.size()-1);
        condition.signalAll();
        lock.unlock();
    }
}
