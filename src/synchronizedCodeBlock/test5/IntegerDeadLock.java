package synchronizedCodeBlock.test5;

/**
 * Created by zhujiating on 2017/8/28.
 */
public class IntegerDeadLock extends Thread {
    private Integer a;
    private Integer b;

    public IntegerDeadLock(Integer a,Integer b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (a){
            try{
                System.out.println("Thrad:"+Thread.currentThread().getName()+" 进入a");
                Thread.sleep(2000);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
            synchronized (b){
                System.out.println("Thrad:"+Thread.currentThread().getName()+" 进入b");
            }
        }
    }

    public static void main(String[] args){
        new IntegerDeadLock(Integer.valueOf(1),Integer.valueOf(2)).start();
        new IntegerDeadLock(Integer.valueOf(2),Integer.valueOf(1)).start();
    }
}
