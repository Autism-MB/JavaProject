package chapter19.reader;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Mr.Xiao
 * @date 2022/07/11 21:10
 * @Contain
 **/
@SuppressWarnings("all")
public class FileWriter_ {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Bing\\Desktop\\learn\\note.txt";
        //创建FileWriter对象
        FileWriter fileWriter = null;
        char[] chars = {'a', 'b', 'c'};
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write('H');
            fileWriter.write(chars); // 默认覆盖
            fileWriter.write("xxxnn".toCharArray(), 0, 3);
            fileWriter.write("  你好~~~~~~~");
            fileWriter.write(" 上海 天津", 0, 2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
