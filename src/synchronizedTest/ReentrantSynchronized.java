package synchronizedTest;

import testConcurr.ReentrantPrint;
import testConcurr.SubReentrantPrint;

/**
 * Created by zhujiating on 2017/8/21.
 */
public class ReentrantSynchronized extends Thread {
     ReentrantPrint reentrantPrint;
     SubReentrantPrint subReentrantPrint;
    public ReentrantSynchronized(ReentrantPrint reentrantPrint,SubReentrantPrint subReentrantPrint){
        this.reentrantPrint = reentrantPrint;
        this.subReentrantPrint = subReentrantPrint;
    }
    @Override
    public void run() {
        //reentrantPrint.mainMethod();'
        subReentrantPrint.subMethod();

    }
}
