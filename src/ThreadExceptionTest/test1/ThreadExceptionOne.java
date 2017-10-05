package ThreadExceptionTest.test1;

public class ThreadExceptionOne extends Thread{

    // 一个绑定线程组的构造器
    public ThreadExceptionOne(ThreadGroup threadGroup,String name) {
        super(threadGroup,name);
    }

    // 一个默认构造器
    public ThreadExceptionOne() {}

    @Override
    public void run() {
        String str = null;
        System.out.println(str.hashCode());
    }

    public static void main(String[] args) {

         // 线程类的异常处理
        ThreadExceptionOne.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程" + t.getName() + "发生异常" + "   这是线程类的异常处理");
                e.printStackTrace();
            }
        });

        ThreadGroup threadGroup = new MythreadGroup("bbbbb");
        ThreadExceptionOne thread = new ThreadExceptionOne(threadGroup,"aaaaa");

        //thread.setName("aaaa");

        // 线程对象的异常处理
        thread.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程" + t.getName() + "发生异常" + "   这是线程对象的异常处理");
                e.printStackTrace();
            }
        });

        thread.start();
    }
}
