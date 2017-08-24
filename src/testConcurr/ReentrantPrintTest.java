package testConcurr;

import synchronizedTest.ReentrantSynchronized;

/**
 * Created by zhujiating on 2017/8/21.
 */
public class ReentrantPrintTest {
    public static void main(String[] args){
        ReentrantPrint reentrantPrint = new ReentrantPrint();
        SubReentrantPrint subReentrantPrint = new SubReentrantPrint();
        ReentrantSynchronized reentrantSynchronized = new ReentrantSynchronized(reentrantPrint,subReentrantPrint);
        reentrantSynchronized.setName("A");
//        ReentrantSynchronized reentrantSynchronized1 = new ReentrantSynchronized(reentrantPrint);
//        reentrantSynchronized1.setName("B");
        reentrantSynchronized.start();
//        reentrantSynchronized1.start();
        System.out.println("AAA".toLowerCase());

    }
}
