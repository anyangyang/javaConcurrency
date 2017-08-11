package StopThread;

import testConcurr.User;

/**
 * Created by zhujiating on 2017/8/10.
 */
public class Suspendproblem extends Thread{
    private User user;
    public Suspendproblem(User user){
        this.user = user;
    }
    @Override
    public void run() {
        System.out.println("线程"+this.getName()+"开始运行");
        user.testSuspend();
        System.out.println("线程"+this.getName()+"结束运行");
    }
}
