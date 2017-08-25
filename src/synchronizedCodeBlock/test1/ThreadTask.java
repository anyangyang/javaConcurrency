package synchronizedCodeBlock.test1;

/**
 * Created by zhujiating on 2017/8/24.
 */
public class ThreadTask {
    private String date1;
    private String date2;

    public void doSomething(){
        try{
           System.out.println("task:"+Thread.currentThread().getName()+"--begin");

            Thread.sleep(2000);
//            date1 = "执行了很长的任务的之后返回参数1："+Thread.currentThread().getName();
//            date2 = "执行了很长的任务的之后返回参数2："+Thread.currentThread().getName();
            synchronized (this){

                date1 =  "执行了很长的任务的之后返回参数1："+Thread.currentThread().getName();
                date2 = "执行了很长的任务的之后返回参数2："+Thread.currentThread().getName();
                doAnything();
                System.out.println(date1);
                System.out.println(date2);
           }
//            System.out.println(date1);
//            System.out.println(date2);
            System.out.println("task:"+Thread.currentThread().getName()+"--end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public synchronized void doAnything(){
        System.out.println("i can do anything:"+Thread.currentThread().getName());
    }
}



//           synchronized (this){
//
//                date1 =  "执行了很长的任务的之后返回参数1："+Thread.currentThread().getName();
//                date2 = "执行了很长的任务的之后返回参数2："+Thread.currentThread().getName();
//                System.out.println(date1);
//                System.out.println(date2);
//            }
