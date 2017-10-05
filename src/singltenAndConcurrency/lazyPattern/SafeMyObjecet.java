package singltenAndConcurrency.lazyPattern;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SafeMyObjecet {
    private static Lock lock = new ReentrantLock();

    private volatile static SafeMyObjecet safeMyObjecet;

    private SafeMyObjecet() {}


    // 双重检查
    public static SafeMyObjecet getSafeMyObject() {
        if (safeMyObjecet == null) {
            synchronized (MyObject.class) {
                if (safeMyObjecet == null) {
                    safeMyObjecet = new SafeMyObjecet();
                }

            }

        }
        return safeMyObjecet;
    }

    // 利用  synchronized 来保证懒汉模式的线程安全
    synchronized public static SafeMyObjecet getLockSafeMyObjecet() {
        if (safeMyObjecet == null) {
            safeMyObjecet = new SafeMyObjecet();
        }

        return safeMyObjecet;
    }

    // 双重检查模式还可以用 还可以用 Lock 来提高效率
    public static SafeMyObjecet getSafeMyObjecetByLock() {
        if (safeMyObjecet == null) {
            lock.lock();
            if( safeMyObjecet == null) {
                safeMyObjecet = new SafeMyObjecet();
            }
            lock.unlock();
        }
        return safeMyObjecet;
    }


    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
               // System.out.println(singltenAndConcurrency.hungryPattern.MyObject.getMyObject().hashCode());
                System.out.println(getSafeMyObjecetByLock().hashCode());

            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
