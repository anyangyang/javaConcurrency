package synchronizedCodeBlock.test2;

/**
 * Created by zhujiating on 2017/8/25.
 */
public class CycleUtil {

    public void doSomething(){
        for(int i = 0;i < 500; i++){
            System.out.println("noSynchronized--"+Thread.currentThread().getName()+":"+i);
        }

        synchronized (this){
            for(int i = 0;i < 500; i++){
                System.out.println("Synchronized--"+Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

