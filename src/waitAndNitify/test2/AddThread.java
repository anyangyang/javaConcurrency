package waitAndNitify.test2;

/**
 * Created by zhujiating on 2017/8/30.
 */
public class AddThread extends Thread {
    private Add add;
    public AddThread(Add add){
        this.add = add;
    }
    @Override
    public void run() {
        add.add();
    }
}
