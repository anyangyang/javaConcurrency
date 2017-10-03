package singltenAndConcurrency.lazyPattern;

public class SafeMyObjecet {

    private static SafeMyObjecet safeMyObjecet;

    private SafeMyObjecet() {}

    public static SafeMyObjecet getSafeMyObject() {
        if (safeMyObjecet == null) {
            synchronized (MyObject.class) {
                if (safeMyObjecet == null) {
                    safeMyObjecet = new SafeMyObjecet();
                }

            }

        }
        return safeMyObjecet;
    }

    synchronized public static SafeMyObjecet getLockSafeMyObjecet() {
        if (safeMyObjecet == null) {
            safeMyObjecet = new SafeMyObjecet();
        }

        return safeMyObjecet;
    }


    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
               // System.out.println(singltenAndConcurrency.hungryPattern.MyObject.getMyObject().hashCode());
                System.out.println(getLockSafeMyObjecet().hashCode());

            }
        };

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {

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
