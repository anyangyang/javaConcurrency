package lockTest.test5;

public class MyThread extends Thread {

    private MyService service;

    public MyThread(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        try{
            service.methodA();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
