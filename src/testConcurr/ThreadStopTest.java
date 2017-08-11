package testConcurr;

import StopThread.*;

/**
 * Created by zhujiating on 2017/8/8.
 */
public class ThreadStopTest {

    public static void main(String[] args){
        try{


//            ThreadStop threadStop = new ThreadStop();
//            threadStop.start();
//            threadStop.sleep(50);
//            threadStop.interrupt();    // 调用 threadStop 修改中断状态
//            System.out.println("是否停止1：" + threadStop.isInterrupted());
//            System.out.println("是否停止2：" + threadStop.isInterrupted());

//            ThreadStopTwo threadStopTwo = new ThreadStopTwo();
//            threadStopTwo.start();
//            threadStopTwo.sleep(8000);
//            threadStopTwo.stop();
//            System.out.println("test end");

//            ThreadStopMethod threadStopMethod = new ThreadStopMethod();
//            threadStopMethod.start();
//            threadStopMethod.sleep(8000);
//            threadStopMethod.stop();
//            User user = new User();
//            ModifiedUserInfo modifiedUserInfo = new ModifiedUserInfo(user,"c","cc");
//            modifiedUserInfo.start();
//            modifiedUserInfo.sleep(55);
//            modifiedUserInfo.stop();
//            System.out.println("用户名：" + user.getUserName()+" 密码："+user.getPassword());
//            ModifiedUserInfo modifiedUserInfo2 = new ModifiedUserInfo(user,"b","bb");
//            modifiedUserInfo2.start();
//            modifiedUserInfo2.sleep(5000);
//            System.out.println("用户名：" + user.getUserName()+" 密码："+user.getPassword());

//            SuspendAndResume suspendAndResume = new SuspendAndResume();
//            suspendAndResume.start();
//            suspendAndResume.sleep(5000);
//            suspendAndResume.suspend();
//            System.out.println("time:"+System.currentTimeMillis()+" counter:"+suspendAndResume.getCounter());
//            suspendAndResume.sleep(1000);
//            System.out.println("time:"+System.currentTimeMillis()+" counter:"+suspendAndResume.getCounter());
//
//            // 恢复之后继续运行
//            suspendAndResume.resume();
//            System.out.println("time:"+System.currentTimeMillis()+" counter:"+suspendAndResume.getCounter());
//            suspendAndResume.sleep(1000);
//            suspendAndResume.setStop(false);
//            System.out.println("time:"+System.currentTimeMillis()+" counter:"+suspendAndResume.getCounter());
//            User user = new User();
//            Suspendproblem suspendproblem = new Suspendproblem(user);
//            suspendproblem.setName("a");
//            suspendproblem.start();
//            Thread.currentThread().sleep(5000);
//            Suspendproblem suspendproblem1 = new Suspendproblem(user);
//            suspendproblem1.setName("b");
//            suspendproblem1.start();
//            System.out.println("main_end");

            SuspendAndResume suspendAndResume = new SuspendAndResume();
            suspendAndResume.start();
            Thread.currentThread().sleep(500);
            suspendAndResume.suspend();
            System.out.println("main_end");

        }catch(InterruptedException e){
            e.printStackTrace();
        }

//        Thread thread =  Thread.currentThread();
//        thread.interrupt();
//        System.out.println("是否停止1：" + thread.interrupted());
//        System.out.println("是否停止2：" + thread.interrupted());
    }
}
