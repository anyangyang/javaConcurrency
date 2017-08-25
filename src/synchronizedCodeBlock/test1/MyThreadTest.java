package synchronizedCodeBlock.test1;


/**
 * Created by zhujiating on 2017/8/24.
 */
public class MyThreadTest {
    public static void main(String[] args)throws InterruptedException{
        ThreadTask threadTask = new ThreadTask();
        MyTread myTread = new MyTread(threadTask);
        myTread.setName("A");
        myTread.start();

        MyTread myTread1 = new MyTread(threadTask);
        myTread1.setName("B");
        myTread1.start();

        Thread.sleep(15000);         // main线程阻塞15秒，以便让其他两个线程执行完成
        long beginTime = CommonUtil.beginA;
        if(CommonUtil.beginB < CommonUtil.beginA)
            beginTime = CommonUtil.beginB;
        long endTime = CommonUtil.endA;
        if(CommonUtil.endB > CommonUtil.endA)
            endTime = CommonUtil.endB;

        System.out.println("花费时间："+ (endTime-beginTime)/1000);

    }
}
