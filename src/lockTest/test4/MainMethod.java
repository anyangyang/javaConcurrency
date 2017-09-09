package lockTest.test4;

public class MainMethod {

    public static void main(String[] args){
        MyService service = new MyService();
        Productor productorA = new Productor(service);
        productorA.setName("productorA");

        Productor productorB = new Productor(service);
        productorB.setName("productorB");

        Customer customerA = new Customer(service);
        customerA.setName("customerA");

        Customer customerB = new Customer(service);
        customerB.setName("customerB");

        productorA.start();
        customerA.start();
        productorB.start();
        customerB.start();



    }
}
