package lockTest.test4;

public class Customer extends Thread {

    private MyService service;

    public Customer(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        try{
            while(true)
                service.pop();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
