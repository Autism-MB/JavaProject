package chapter20.upload;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Mr.Xiao
 * @date 2022/07/19 10:03
 * @Contain 文件上传的服务端
 **/
@SuppressWarnings("all")
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端监听8888端口...");

        Socket socket = serverSocket.accept();

        //读取客户端发送的数据
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        String destFilePath = "src\\dd.jpg";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
        bos.write(bytes);
        bos.close();

        bis.close();
        socket.close();
        serverSocket.close();
    }
}
