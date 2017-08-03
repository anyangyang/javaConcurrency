package orderResort;

/**
 * Created by zhujiating on 2017/7/31.
 */
    public class OrderResort {
         static int x,y;
         static int a,b;

        public static void main(String[] args) throws InterruptedException{
            int counter = 10000;
            for(int i=0;i<counter;i++){
                x = y = a = b = 0;
                Thread one = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        a=1;
                        x=b;
                    }
                });

                Thread other = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        b=1;
                        y=a;
                    }
                });

                one.start();
                other.start();
                one.join();
                other.join();
                System.out.println("第" + i + " 次" + " ("+ x + "," + y + ")");
                if(x == 1 && y == 1)
                    break;

            }



        }
    }



