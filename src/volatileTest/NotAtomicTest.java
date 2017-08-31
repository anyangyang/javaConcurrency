package volatileTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zhujiating on 2017/8/28.
 */
public class NotAtomicTest extends  Thread {
    //private volatile static int i = 0;       // 测试是否具有原子性
    private static AtomicInteger i = new AtomicInteger(0);
    static void addI(){
       //i++;
        i.incrementAndGet();
       System.out.println("i="+i);
    }
    @Override
    public void run() {
        addI();
    }

    public static void main(String[] args){
        NotAtomicTest[] notAtomicTests = new NotAtomicTest[10000];
        for(int i=0;i<10000;i++){
            notAtomicTests[i] = new NotAtomicTest();
        }
        for(int i=0;i<10000;i++){
            notAtomicTests[i].start();
        }
    }
}
