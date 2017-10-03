package singltenAndConcurrency.lazyPattern;

public class MyObject {

    private static MyObject myObject;

    // 私有构造器
    private MyObject() {}

    public static MyObject getMyObject() throws InterruptedException{

        if (myObject == null) {
            Thread.sleep(5000);
            myObject = new MyObject();
        }

        return myObject;
    }

    public static void main(String[] args) {
        // 模拟多线程环境下，懒汉模式不安全
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(getMyObject().hashCode());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);


        // 启动看下测试结果
        thread.start();
        thread1.start();
        thread2.start();


    }





}
