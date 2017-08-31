package waitAndNitify.Test3.PCQuestion1;

/**
 * Created by zhujiating on 2017/8/30.
 */
public class GetValue {
    private String lock;
    public GetValue(String lock){
        this.lock = lock;
    }
    public void getValue()throws InterruptedException{
        synchronized (lock){
            if(CommonUtil.value.equals("")){
                lock.wait();
            }
            System.out.println("CommonUtil value:"+CommonUtil.value);
            CommonUtil.value = "";
            lock.notify();
        }
    }
}
