package testConcurr;

/**
 * Created by zhujiating on 2017/8/16.
 */
public class TestPriority2 extends Thread {
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        while(true){
            counter++;
        }
    }
}
