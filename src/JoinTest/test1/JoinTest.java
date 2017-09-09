package JoinTest.test1;

/**
 * Created by zhujiating on 2017/8/31.
 */
public class JoinTest extends Thread{
    @Override
    public void run() {
        System.out.println("进入join线程");
        try{
            Thread.sleep(8000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("退出join线程");

    }
}
