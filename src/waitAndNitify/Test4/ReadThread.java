package waitAndNitify.Test4;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Created by zhujiating on 2017/8/31.
 */
public class ReadThread extends Thread {
    private PipedInputStream pipedInputStream;
    private ReadDate readDate;

    public ReadThread(PipedInputStream pipedInputStream,ReadDate readDate){
        this.pipedInputStream = pipedInputStream;
        this.readDate = readDate;
    }

    @Override
    public void run() {
        try{
            readDate.read(pipedInputStream);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
