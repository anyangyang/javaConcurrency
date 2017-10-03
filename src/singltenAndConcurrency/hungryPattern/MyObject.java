package singltenAndConcurrency.hungryPattern;

public class MyObject {

    // 静态成员变量
    private static MyObject myObject = new MyObject();

    // 私有的构造器
    private MyObject() {}

    // 获取变量的静态方法
    public static MyObject getMyObject() {
        return myObject;
    }

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(MyObject.getMyObject().hashCode());
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
