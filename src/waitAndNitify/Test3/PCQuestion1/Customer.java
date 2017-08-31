package waitAndNitify.Test3.PCQuestion1;

/**
 * Created by zhujiating on 2017/8/30.
 */
public class Customer extends Thread {

    private GetValue getValue;
    public Customer(GetValue getValue){
        this.getValue = getValue;
    }

    @Override
    public void run() {
        while(true){
            try{
                getValue.getValue();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

