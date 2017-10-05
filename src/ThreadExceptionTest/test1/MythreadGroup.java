package ThreadExceptionTest.test1;

public class MythreadGroup extends ThreadGroup{

    // 必须要有一个自己的构造器
    public MythreadGroup(String name){
        super(name);
    }
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("线程" + t.getName() + "发生异常" + "   这是线程组的异常处理");
        e.printStackTrace();
    }
}
