package StopThread;

/**
 * Created by zhujiating on 2017/8/10.
 */
public class SuspendAndResume extends Thread {
    private int counter = 0;
    private Boolean stop = true;
//
//    public int getCounter() {return counter;}
//
//    public void setCounter(int counter) {this.counter = counter;}
//
//    public Boolean getStop() {return stop;}
//
//    public void setStop(Boolean stop) {this.stop = stop;}

    @Override
    public void run() {
        while(stop){
            counter++;
            System.out.println("counter="+counter);
        }
    }
}
