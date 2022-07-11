package chapter19.inputstream_;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Mr.Xiao
 * @date 2022/07/08 09:17
 * @Contain
 **/
@SuppressWarnings("all")
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01() {
        String pathName = "C:\\Users\\Bing\\Desktop\\learn\\hello.txt";
        int readData = 0;

        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(pathName);
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();   
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void readFile02() {
        String filePath = "C:\\Users\\Bing\\Desktop\\learn\\hello.txt";
        int readData = 0;

        byte[] buf = new byte[11];
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(filePath);
            while ((readData = fileInputStream.read(buf)) != -1) {
                System.out.println(new String(buf, 0, readData));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
