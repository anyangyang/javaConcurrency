package synchronizedCodeBlock.test3;

/**
 * Created by zhujiating on 2017/8/25.
 */
public class ThreadPrintA extends Thread{
    StaticMethod staticMethod;
    public ThreadPrintA(StaticMethod staticMethod){
        this.staticMethod = staticMethod;
    }
    @Override
    public void run() {
        staticMethod.printA();
    }
}
