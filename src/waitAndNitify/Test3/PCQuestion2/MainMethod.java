package waitAndNitify.Test3.PCQuestion2;


/**
 * Created by zhujiating on 2017/8/30.
 */
public class MainMethod {
    public static void main(String[] args){
        ListUtil listUtil = new ListUtil();
        // 首先测试一下一生产者对一消费者 ok
        // 在测试一下一生产者多消费者
        Productor productor = new Productor(listUtil);
        Productor productor1 = new Productor(listUtil);
        Customer customer = new Customer(listUtil);
        Customer customer1 = new Customer(listUtil);
        productor.start();
        productor1.start();
        customer.start();
        customer1.start();
    }
}
