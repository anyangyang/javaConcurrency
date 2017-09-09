package waitAndNitify.test6;

public class MainMethod {

    public static void main(String[] args){
        for(int i=0;i<100;i++){
            System.out.println("在线程main中取值："+CommonUtils.inheritableThreadLocal.get());
        }

        MyThread myThread = new MyThread();
        myThread.start();
    }
}
