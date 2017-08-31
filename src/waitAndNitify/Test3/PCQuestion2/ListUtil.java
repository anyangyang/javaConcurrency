package waitAndNitify.Test3.PCQuestion2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhujiating on 2017/8/30.
 */
public class ListUtil {
    private List<String> list = new ArrayList<String>();

    public void push()throws InterruptedException{
        synchronized (this){
            while(list.size() == 1){             // 假设队列的容量为1，可以规定队列是否已满，如果已满的话，就让他等待
                System.out.println("生产者"+Thread.currentThread().getName()+"进入wait");
                this.wait();
                System.out.println("生产者"+Thread.currentThread().getName()+"退出wait");
            }
            list.add("anything");
            System.out.println("生产者生产了一个产品，现在的产品数量是："+list.size());
            //this.notify();
            this.notifyAll();

        }
    }

    public void pop()throws InterruptedException{
        synchronized (this){
            while(list.size() == 0){             // 假设队列的容量为1，可以规定队列是否已满，如果已满的话，就让他等待
                System.out.println("消费者"+Thread.currentThread().getName()+"进入wait");
                this.wait();                   // 这条语句可能会导致出现假死，因为消费者在消费之后，可能唤醒是另一个消费者，该消费者切换之后，发现队列中没有产品，就会继续wait（等待）
                System.out.println("消费者"+Thread.currentThread().getName()+"退出wait");
            }
            System.out.println("消费者"+Thread.currentThread().getName()+"消费："+list.get(0));
            list.remove(0);
            //this.notify();
            this.notifyAll();
        }
    }
}
