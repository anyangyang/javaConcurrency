package threadGroup.OneLevel;

public class OneLevelThreadGroup implements Runnable{

    @Override
    public void run() {
       try{
           while(!Thread.currentThread().isInterrupted()){
               System.out.println(Thread.currentThread().getName());
               Thread.sleep(3000);
           }
       }catch (InterruptedException e){
          e.printStackTrace();
       }
    }

    public static void main(String[] args) {
        // 先创建一个线程组
        ThreadGroup threadGroup = new ThreadGroup("anyang");
        OneLevelThreadGroup runnable = new OneLevelThreadGroup();
        // 将线程绑定到线程组
        Thread thread = new Thread(threadGroup,runnable);
        Thread thread1 = new Thread(threadGroup,runnable);
        // 启动线程
        thread.start();
        thread1.start();
        // 线程组中的活跃线程数
        System.out.println(threadGroup.activeCount());
        // 线程组名
        System.out.println(threadGroup.getName());

    }
}
