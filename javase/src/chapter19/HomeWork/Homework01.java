package chapter19.HomeWork;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Mr.Xiao
 * @date 2022/07/17 11:26
 * @Contain
 **/
@SuppressWarnings("all")
public class Homework01 {
    public static void main(String[] args) throws IOException {

        String directoryPath = "C:\\Users\\Bing\\Desktop\\learn\\mytemp";
        File file = new File(directoryPath);
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("创建 " + directoryPath + " 创建成功");
            }else {
                System.out.println("创建 " + directoryPath + " 创建失败");
            }
        }

        String filePath = directoryPath + "\\hello.txt";
        file = new File(filePath);
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println(filePath + " 创建成功~");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
                bufferedWriter.write("hello");
                bufferedWriter.close();
            } else {
                System.out.println(filePath + " 创建失败~");
            }
        } else {
            System.out.println(filePath + " 已经存在,不存在重复创建...");
        }
    }
}
