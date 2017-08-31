package waitAndNitify.Test3.PCQuestion2;

/**
 * Created by zhujiating on 2017/8/30.
 */
public class Customer extends Thread {
    private ListUtil listUtil;
    public Customer(ListUtil listUtil){
        this.listUtil = listUtil;
    }

    @Override
    public void run() {

        try{
            while(true){
                listUtil.pop();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
