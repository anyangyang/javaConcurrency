package lockTest.test2;

public class MainMethod {

    public static void main(String[] args){
        MyService service = new MyService();
        MyThread myThread = new MyThread(service);
        myThread.start();
    }
}
