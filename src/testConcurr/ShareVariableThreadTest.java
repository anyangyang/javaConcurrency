package testConcurr;

import shareVariable.ShareVariableThread;

/**
 * Created by zhujiating on 2017/8/7.
 */
public class ShareVariableThreadTest {

    public static void main(String[] args){
        ShareVariableThread thread1 = new ShareVariableThread("A");
        ShareVariableThread thread2 = new ShareVariableThread("B");
        ShareVariableThread thread3 = new ShareVariableThread("C");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
