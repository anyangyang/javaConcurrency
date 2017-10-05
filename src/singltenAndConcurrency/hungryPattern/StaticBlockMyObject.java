package singltenAndConcurrency.hungryPattern;

import singltenAndConcurrency.lazyPattern.SafeMyObjecet;

public class StaticBlockMyObject {

    private static StaticBlockMyObject staticBlockMyObject = null;

    private StaticBlockMyObject() {}

    static {
        staticBlockMyObject = new StaticBlockMyObject();
    }

    public static StaticInnerMyObject getMyObject() {
        return StaticInnerMyObject.MyObject.staticInnerMyObject;
    }

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // System.out.println(singltenAndConcurrency.hungryPattern.MyObject.getMyObject().hashCode());
                System.out.println(StaticInnerMyObject.MyObject.staticInnerMyObject.hashCode());

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
