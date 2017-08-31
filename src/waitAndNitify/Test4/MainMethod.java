package waitAndNitify.Test4;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by zhujiating on 2017/8/31.
 */
public class MainMethod {

    public static void main(String[] args)throws IOException{
        ReadDate readDate = new ReadDate();
        WriteDate writeDate = new WriteDate();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream();

        pipedInputStream.connect(pipedOutputStream);       //将管道输出流和管道输入流绑定

        ReadThread readThread = new ReadThread(pipedInputStream,readDate);
        WriteThread writeThread = new WriteThread(pipedOutputStream,writeDate);

        readThread.start();
        writeThread.start();

    }
}
