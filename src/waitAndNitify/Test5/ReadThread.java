package waitAndNitify.Test5;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedReader;

/**
 * Created by zhujiating on 2017/8/31.
 */
public class ReadThread extends Thread {
    private PipedReader pipedReader;
    private ReadDate readDate;

    public ReadThread(PipedReader pipedReader,ReadDate readDate){
        this.pipedReader = pipedReader;
        this.readDate = readDate;
    }

    @Override
    public void run() {
        try{
            readDate.read(pipedReader);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
