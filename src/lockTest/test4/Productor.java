package lockTest.test4;

public class Productor extends Thread {

    private MyService service;

    public Productor(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        try{
            while(true)
                service.put();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
