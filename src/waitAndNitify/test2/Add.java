package waitAndNitify.test2;

/**
 * Created by zhujiating on 2017/8/30.
 */
public class Add {
    private String lock;
    public Add(String lock){
        this.lock = lock;
    }

    public void add(){
        synchronized (lock){
            CommonUtil.list.add("anything");
            lock.notify();
        }
    }
}
