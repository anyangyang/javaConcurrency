package waitAndNitify.Test5;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedReader;

/**
 * Created by zhujiating on 2017/8/31.
 */
public class ReadDate {

    public void read(PipedReader pipedReader)throws IOException{
        char[] res = new char[20];               // 相对于管道字节流来说，最重要的修改就是这一步，申请的是字符数组，而不是字节数组
        int readLength = pipedReader.read(res);
        while(readLength > -1){
            String response = new String(res,0,readLength);
            System.out.println(response);
            readLength = pipedReader.read(res);
        }
        pipedReader.close();

    }
}
