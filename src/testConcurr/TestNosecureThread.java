package testConcurr;

import synchronizedTest.NosecureThread;

/**
 * Created by zhujiating on 2017/8/18.
 */
public class TestNosecureThread {

    public static void main(String[] args){
        User user = new User();
        NosecureThread nosecureThread = new NosecureThread(user,18);
        nosecureThread.setName("A");
        NosecureThread nosecureThread1 = new NosecureThread(user,20);
        nosecureThread1.setName("B");
        nosecureThread.start();
        nosecureThread1.start();

    }
}
