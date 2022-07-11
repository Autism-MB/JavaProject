package chapter19.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Mr.Xiao
 * @date 2022/07/11 19:37
 * @Contain
 **/
public class FileCopy {
    public static void main(String[] args) {

        //C:\Users\Bing\Desktop\learn
        String FilePath = "C:\\Users\\Bing\\Desktop\\learn\\dd.jpg";
        String destFilePath = "C:\\Users\\Bing\\Desktop\\learn\\a\\dd.jpg";

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(FilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            //定义一个字节数组,提高读取效果
            byte[] buf = new byte[1024];
            int readLen = 0;

            while ((readLen = fileInputStream.read(buf)) != -1) {
                fileOutputStream.write(buf, 0, readLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }

                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
