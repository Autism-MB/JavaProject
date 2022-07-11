package chapter19.outputstream_;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Mr.Xiao
 * @date 2022/07/10 19:49
 * @Contain
 **/
@SuppressWarnings("all")
public class FileOutputStream01 {
    public static void main(String[] args) {


    }

    @Test
    public void writeFile() {
        String filePath = "C:\\Users\\Bing\\Desktop\\learn\\hello.txt";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath);
//            fileOutputStream.write('o');

            String str = "hello,world";
//            fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
            fileOutputStream.write(str.getBytes(), 0, 3);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
