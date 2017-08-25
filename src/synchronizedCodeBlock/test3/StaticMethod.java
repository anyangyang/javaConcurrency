package synchronizedCodeBlock.test3;

/**
 * Created by zhujiating on 2017/8/25.
 */
public class StaticMethod {

    public synchronized static void doSomething(){
        System.out.println("线程'"+Thread.currentThread().getName()+"'begin");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("线程'"+Thread.currentThread().getName()+"'end");

    }
    public  static void doElse(){
        synchronized (StaticMethod.class){
            System.out.println("线程'"+Thread.currentThread().getName()+"'doElse:begin");
            System.out.println("线程'"+Thread.currentThread().getName()+"'doElse:end");
        }
    }

    public synchronized void printA(){
        System.out.println("线程'"+Thread.currentThread().getName()+"'printA:begin");

        System.out.println("线程'"+Thread.currentThread().getName()+"'printA:end");
    }

}
