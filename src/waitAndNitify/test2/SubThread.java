package waitAndNitify.test2;

/**
 * Created by zhujiating on 2017/8/30.
 */
public class SubThread extends Thread{
    private Subtract subtract;
    public SubThread(Subtract subtract){
        this.subtract = subtract;
    }

    @Override
    public void run() {
        try{
            subtract.subtract();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
