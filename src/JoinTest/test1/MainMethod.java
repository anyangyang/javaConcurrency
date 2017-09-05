package JoinTest.test1;

/**
 * Created by zhujiating on 2017/8/31.
 */
public class MainMethod {

    InheritableThreadLocal local = new InheritableThreadLocal();

    public static void main(String[] args) throws InterruptedException{
        System.out.println("进入main线程");
        JoinTest joinTest = new JoinTest();
        joinTest.start();
        long now = System.currentTimeMillis();
        System.out.println("开始等待join线程：");
        joinTest.join();   // 等待joinTest 线程结束
        System.out.println("退出等待join线程,等待了"+ (System.currentTimeMillis()-now)/1000+"秒");
        System.out.println("退出main线程");


    }
}
