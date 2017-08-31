package waitAndNitify.Test3.PCQuestion1;

/**
 * Created by zhujiating on 2017/8/30.
 */
public class Productor extends Thread{
    private SetValue setValue;
    public Productor(SetValue setValue){
        this.setValue = setValue;
    }

    @Override
    public void run() {
        while(true){
            try{
                setValue.setValue();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
