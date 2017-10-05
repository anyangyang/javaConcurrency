package singltenAndConcurrency.hungryPattern;

public class StaticInnerMyObject {

    // 利用静态内部类实现的 饿汉模式

    static class MyObject {
        public static StaticInnerMyObject staticInnerMyObject = new StaticInnerMyObject();
    }
    private StaticInnerMyObject() {}

    public static StaticInnerMyObject getMyObject() {
        return MyObject.staticInnerMyObject;
    }

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // System.out.println(singltenAndConcurrency.hungryPattern.MyObject.getMyObject().hashCode());
                System.out.println(MyObject.staticInnerMyObject.hashCode());

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
