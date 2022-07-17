package chapter20.upload;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Mr.Xiao
 * @date 2022/07/19 10:04
 * @Contain 文件上传的客户端
 **/
@SuppressWarnings("all")
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        String filePath = "C:\\Users\\Bing\\Desktop\\learn\\dd.jpg";

        //创建读取磁盘文件的输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));

        //bytes 就是filePath对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //通过socket获取到输出流,将bytes数据发送给服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bis.close();
        //设置写入数据的结束标志
        socket.shutdownOutput();
        //关闭相关的流
        bos.close();
        socket.close();
    }
}
