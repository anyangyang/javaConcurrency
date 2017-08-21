package synchronizedTest;

import testConcurr.User;

/**
 * Created by zhujiating on 2017/8/18.
 */

public class NosecureThread extends Thread{

    private final User user;
    private int age;
    public NosecureThread(User user,int age){
        this.user = user;
        this.age = age;
    }

    @Override
    public void run() {
//        try{
            //user.age = this.age;
            user.modifiedAge(age);
            //this.sleep(2000);
           // System.out.println("线程"+Thread.currentThread().getName()+"的年龄为："+user.age);
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        }

    }
}
