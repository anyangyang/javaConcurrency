package lockTest.test3;

public class MainMethod {

    public static void main(String[] args) throws InterruptedException{
        MyService service = new MyService();
        MyThread myThread = new MyThread(service);
        myThread.setName("BB");
        myThread.start();

        Thread.sleep(1000);
        service.singal();
    }
}
