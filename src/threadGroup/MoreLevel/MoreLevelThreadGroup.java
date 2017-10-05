package threadGroup.MoreLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MoreLevelThreadGroup implements Runnable{

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void run() {
       try{
           while(!Thread.currentThread().isInterrupted()){
//               System.out.println(Thread.currentThread().getName());
               sdf.parse("2017-3-3");
               Thread.sleep(3000);
           }
       }catch (InterruptedException e){
          e.printStackTrace();
       }catch (ParseException e){
           e.printStackTrace();
       }
    }

    public static void main(String[] args) {
        // 先获取 main 线程组
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        // 创建一个线程组将其绑定到系统线程组中
        ThreadGroup threadGroup = new ThreadGroup(mainGroup,"subThreadGroup");
        Thread thread = new Thread(threadGroup,new MoreLevelThreadGroup());

        thread.start();

        System.out.println("活跃的线程组数：" + mainGroup.activeGroupCount());
        ThreadGroup[] threadGroups = new ThreadGroup[mainGroup.activeGroupCount()];
        mainGroup.enumerate(threadGroups);
        for(ThreadGroup group:threadGroups){
            System.out.println("当前线程组名：" + group.getName());
            // 父线程组
            System.out.println("当前线程组的父线程组：" + group.getParent().getName());
            // 当前线程组中活跃的线程数
            Thread[] threads = new Thread[group.activeCount()];
            group.enumerate(threads);
            for(Thread thread1 : threads){
                System.out.println("当前活跃的线程：" + thread1.getName());
            }
        }
    }
}
