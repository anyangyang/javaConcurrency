package TimerTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest1 {
    private static Timer timer = new Timer();
    // 创建一个静态内部类用来定义要执行的任务
    public static class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("myTask 正在运行：" + new Date());
            System.out.println("myTask 结束运行：" + new Date());

        }
    }

    public static void main(String[] args) throws ParseException{
        // 指定任务运行的时间
        String taskTime = "2017-9-23 10:43:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date taskDate = sdf.parse(taskTime);
        // 绑定任务
        timer.schedule(new MyTask(),taskDate);
    }

}
