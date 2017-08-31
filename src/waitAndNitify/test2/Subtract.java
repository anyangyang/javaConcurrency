package waitAndNitify.test2;

/**
 * Created by zhujiating on 2017/8/30.
 */
public class Subtract {
    private String lock;
    public Subtract(String lock){
        this.lock = lock;
    }

    public void subtract() throws InterruptedException{
        synchronized (lock){
            if(CommonUtil.list.size() == 0){
                System.out.println("线程"+Thread.currentThread().getName()+"准备调用 wait");
                lock.wait();
                System.out.println("线程"+Thread.currentThread().getName()+"退出 wait");
            }
            CommonUtil.list.remove(CommonUtil.list.size()-1);
            System.out.println("list size:"+CommonUtil.list.size());
            System.out.println(System.nanoTime());
        }
    }


}
