package waitAndNitify.Test3.PCQuestion1;

/**
 * Created by zhujiating on 2017/8/30.
 */
public class MainMethod {
    public static void main(String[] args){
        String lock = "lock";
        SetValue setValue = new SetValue(lock);
        GetValue getValue = new GetValue(lock);
        Productor productor = new Productor(setValue);
        productor.start();

        Customer customer = new Customer(getValue);
        customer.start();

    }
}
