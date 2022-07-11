package chapter19.reader_;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Mr.Xiao
 * @date 2022/07/11 20:00
 * @Contain
 **/
@SuppressWarnings("all")
public class FileReader_ {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01() {
        String FilePath = "C:\\Users\\Bing\\Desktop\\learn\\hello.txt";
        FileReader fileReader = null;
        int data = 0;

        try {
            fileReader = new FileReader(FilePath);
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void readFile02() {
        String FilePath = "C:\\Users\\Bing\\Desktop\\learn\\hello.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[8];
        try {
            fileReader = new FileReader(FilePath);
            while ((readLen = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
