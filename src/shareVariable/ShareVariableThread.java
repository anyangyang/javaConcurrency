package shareVariable;

/**
 * Created by zhujiating on 2017/8/7.
 */
public class ShareVariableThread  extends  Thread{

    private  int counter;           // ps:请注意这一句
    // 设置线程名
    public ShareVariableThread(String name){
        super.setName(name);
        counter = 5;
    }

    @Override
    public void run() {
        while(counter > 0){
            System.out.println("由 "+Thread.currentThread().getName()+" 来计算counter："+counter);
            counter--;
        }
    }


}



