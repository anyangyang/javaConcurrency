package waitAndNitify.Test5;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * Created by zhujiating on 2017/8/31.
 */
public class WriteDate {

    public void write(PipedWriter pipedWriter)throws IOException{
        String request = null;
        for(int i=0;i<100;i++){
            request = " "+i;
            pipedWriter.write(request);
        }
        pipedWriter.close();
    }
}
