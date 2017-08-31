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
            pipedWriter.write(request);          //  这一步也非常重要，在管道字节输出流中，不用将字符串转换成字节数组，而是直接输出
        }
        pipedWriter.close();
    }
}
