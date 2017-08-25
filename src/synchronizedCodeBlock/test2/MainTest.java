package synchronizedCodeBlock.test2;

/**
 * Created by zhujiating on 2017/8/25.
 */
public class MainTest {
    public static void main(String[] args){
        CycleUtil cycleUtil = new CycleUtil();
        Mythread mythread = new Mythread(cycleUtil);
        mythread.setName("A");

        Mythread mythread2 = new Mythread(cycleUtil);
        mythread2.setName("B");

        mythread.start();
        mythread2.start();
    }
}
