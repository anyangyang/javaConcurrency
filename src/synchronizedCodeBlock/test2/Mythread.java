package synchronizedCodeBlock.test2;



/**
 * Created by zhujiating on 2017/8/25.
 */
public class Mythread extends Thread {

    CycleUtil cycleUtil;

    public Mythread(CycleUtil cycleUtil){
        this.cycleUtil = cycleUtil;
    }

    @Override
    public void run() {
        cycleUtil.doSomething();
    }
}
