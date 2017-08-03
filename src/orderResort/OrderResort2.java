package orderResort;

/**
 * Created by zhujiating on 2017/7/31.
 */
public class OrderResort2 {
    static int count = 0;
    private Boolean flag = false;
    private int a = 0;

    public void reader(){
        if(flag){
            int i = a * a;
            System.out.println("第"+ count++ + "结果："+ i);
        } else {
            System.out.println("第"+ count++ + "结果：0");
        }
    }

    public void writer(){
        a = 1;
        flag = true;
    }

    public static void main(String[] args) throws InterruptedException{
        int counter = 50;
        OrderResort2 orderResort2 = new OrderResort2();
        for(int i=0;i<counter;i++){
            orderResort2.a = 0;
            orderResort2.flag = false;
            Thread one = new Thread(new Runnable() {
                @Override
                public void run() {
                    orderResort2.writer();
                }
            });

            Thread other = new Thread(new Runnable() {
                @Override
                public void run() {
                    orderResort2.reader();
                }
            });

            one.start();
            other.start();
            one.join();
            other.join();
        }
    }
}
