package waitAndNitify.Test3.PCQuestion2;

/**
 * Created by zhujiating on 2017/8/30.
 */
public class Productor extends Thread {
    private ListUtil listUtil;
    public Productor(ListUtil listUtil){
        this.listUtil = listUtil;
    }

    @Override
    public void run() {
        try{
            while(true){

                listUtil.push();
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
