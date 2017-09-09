package lockTest.test5;

public class MainMethod {

    public static void main(String[] args){
        MyService service = new MyService();

        // 创建两个线程
        MyThread mythread1 = new MyThread(service);
        mythread1.setName("A");
        MyThread mythread2 = new MyThread(service);
        mythread2.setName("B");

        mythread1.start();
        mythread2.start();

    }
}
