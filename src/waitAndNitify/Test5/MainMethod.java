package waitAndNitify.Test5;

import java.io.*;

/**
 * Created by zhujiating on 2017/8/31.
 */
public class MainMethod {

    public static void main(String[] args)throws IOException{
        ReadDate readDate = new ReadDate();
        WriteDate writeDate = new WriteDate();
        PipedWriter pipedWriter = new PipedWriter();
        PipedReader pipedReader = new PipedReader();

        pipedWriter.connect(pipedReader);       //将管道输出流和管道输入流绑定

        ReadThread readThread = new ReadThread(pipedReader,readDate);
        WriteThread writeThread = new WriteThread(pipedWriter,writeDate);

        readThread.start();
        writeThread.start();

    }
}
