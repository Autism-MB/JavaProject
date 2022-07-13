package chapter19.reader_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Mr.Xiao
 * @date 2022/07/13 22:34
 * @Contain
 **/
@SuppressWarnings("all")
public class BufferedReader_ {
    public static void main(String[] args) throws IOException {

        String filePath = "C:\\JavaProject\\javase\\src\\chapter19\\writer_\\Test_.java";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
