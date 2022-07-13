package chapter19.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Mr.Xiao
 * @date 2022/07/13 22:47
 * @Contain
 **/
@SuppressWarnings("all")
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\Bing\\Desktop\\learn\\note.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));

        bufferedWriter.write("hello world1");
        bufferedWriter.newLine();
        bufferedWriter.write("hello world2");
        bufferedWriter.newLine();
        bufferedWriter.write("hello world3");
        bufferedWriter.newLine();

        bufferedWriter.close();

    }
}
