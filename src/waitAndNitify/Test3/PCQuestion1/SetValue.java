package waitAndNitify.Test3.PCQuestion1;

/**
 * Created by zhujiating on 2017/8/30.
 */
public class SetValue {
    private String lock;
    public SetValue(String lock){
        this.lock = lock;
    }

    public void setValue()throws InterruptedException{
        synchronized (lock){
            if(!CommonUtil.value.equals("")){
                lock.wait();
            }
            // 给value 赋值
            CommonUtil.value = System.currentTimeMillis()+"_"+System.nanoTime();

            lock.notify();
        }
    }
}
