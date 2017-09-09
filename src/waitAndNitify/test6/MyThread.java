package waitAndNitify.test6;

public class MyThread extends Thread{

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("在线程A中取值："+CommonUtils.inheritableThreadLocal.get());
        }
    }
}
