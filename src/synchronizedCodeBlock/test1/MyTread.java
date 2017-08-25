package synchronizedCodeBlock.test1;

import synchronizedCodeBlock.test1.CommonUtil;
import synchronizedCodeBlock.test1.ThreadTask;

/**
 * Created by zhujiating on 2017/8/24.
 */
public class MyTread extends Thread {
    ThreadTask threadTask;
    public MyTread(ThreadTask threadTask){
        this.threadTask = threadTask;
    }

    @Override
    public void run() {
        if(Thread.currentThread().getName() == "A")
            CommonUtil.beginA = System.currentTimeMillis();
        else
            CommonUtil.beginB = System.currentTimeMillis();

        threadTask.doSomething();

        if(Thread.currentThread().getName() == "A")
            CommonUtil.endA = System.currentTimeMillis();
        else
            CommonUtil.endB = System.currentTimeMillis();
    }
}
