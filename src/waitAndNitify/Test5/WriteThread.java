package waitAndNitify.Test5;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * Created by zhujiating on 2017/8/31.
 */
public class WriteThread extends Thread {
    private PipedWriter pipedWriter;
    private WriteDate writeDate;
    public WriteThread(PipedWriter pipedWriter,WriteDate writeDate){
        this.pipedWriter = pipedWriter;
        this.writeDate = writeDate;
    }

    @Override
    public void run() {
        try{
            writeDate.write(pipedWriter);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
