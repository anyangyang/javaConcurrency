package waitAndNitify.Test4;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * Created by zhujiating on 2017/8/31.
 */
public class WriteThread extends Thread {
    private PipedOutputStream pipedOutputStream;
    private WriteDate writeDate;
    public WriteThread(PipedOutputStream pipedOutputStream,WriteDate writeDate){
        this.pipedOutputStream = pipedOutputStream;
        this.writeDate = writeDate;
    }

    @Override
    public void run() {
        try{
            writeDate.write(pipedOutputStream);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
