package waitAndNitify.Test4;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * Created by zhujiating on 2017/8/31.
 */
public class WriteDate {

    public void write(PipedOutputStream pipedOutputStream)throws IOException{
        String request = null;
        for(int i=0;i<100;i++){
            request = " "+i;
            pipedOutputStream.write(request.getBytes());
        }
        pipedOutputStream.close();
    }
}
