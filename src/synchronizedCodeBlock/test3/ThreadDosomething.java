package synchronizedCodeBlock.test3;

/**
 * Created by zhujiating on 2017/8/25.
 */
public class ThreadDosomething extends Thread{

    @Override
    public void run() {
        StaticMethod.doSomething();
    }
}
