package synchronizedCodeBlock.test3;

/**
 * Created by zhujiating on 2017/8/25.
 */
public class MainTest {
    public static void main(String[] args){
        StaticMethod staticMethod = new StaticMethod();
        ThreadDosomething threadDosomething = new ThreadDosomething();
        threadDosomething.setName("A");
        ThreadDoElse threadDoElse = new ThreadDoElse();
        threadDoElse.setName("B");
        ThreadPrintA threadPrintA = new ThreadPrintA(staticMethod);
        threadPrintA.setName("C");

        threadDosomething.start();
        threadDoElse.start();
        threadPrintA.start();
    }
}

