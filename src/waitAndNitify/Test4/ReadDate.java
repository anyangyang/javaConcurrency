package waitAndNitify.Test4;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Created by zhujiating on 2017/8/31.
 */
public class ReadDate {

    public void read(PipedInputStream pipedInputStream)throws IOException{
        byte[] res = new byte[20];
        int readLength = pipedInputStream.read(res);
        while(readLength > -1){
            String response = new String(res,0,readLength);
            System.out.println(response);
            readLength = pipedInputStream.read(res);
        }
        pipedInputStream.close();

    }
}
