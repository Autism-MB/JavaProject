package chapter19.transformation_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Mr.Xiao
 * @date 2022/07/17 10:20
 * @Contain
 **/
@SuppressWarnings("all")
public class CodeQuestion {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Bing\\Desktop\\learn\\hello.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String s = br.readLine();
            System.out.println("读取的内容：" + s);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
