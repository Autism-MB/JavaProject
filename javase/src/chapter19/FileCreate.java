package chapter19;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author Mr.Xiao
 * @date 2022/07/07 11:12
 * @Contain
 **/
@SuppressWarnings("all")
public class FileCreate {
    public static void main(String[] args) {


    }

    @Test
    public void create01() {
        String filePath = "C:\\Users\\Bing\\Desktop\\learn\\news1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功 11ms");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void create02() {
        File parentFile = new File("C:\\Users\\Bing\\Desktop\\learn\\");
        String fileName = "news2.txt";
        File file = new File(parentFile, fileName);

        try {
            file.createNewFile();
            System.out.println("创建成功~ 15ms");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void create03() {
        String parentPath = "C:\\Users\\Bing\\Desktop\\learn\\";
        String fileName = "news3.txt";
        File file = new File(parentPath, fileName);

        try {
            file.createNewFile();
            System.out.println("创建成功~ 5ms");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }


}
