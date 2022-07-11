package chapter19;

import org.junit.Test;

import java.io.File;

/**
 * @author Mr.Xiao
 * @date 2022/07/07 19:22
 * @Contain
 **/
@SuppressWarnings("all")
public class Directory_ {
    public static void main(String[] args) {

    }

    //判断 C:\Users\Bing\Desktop\learn\news1.txt 是否存在，如果存在就删除
    @Test
    public void m1() {
        String filePath = "C:\\Users\\Bing\\Desktop\\learn\\news1.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + " 删除成功");
            } else {
                System.out.println(filePath + " 删除失败");
            }
        } else {
            System.out.println("该文件不存在...");
        }
    }

    @Test
    public void m2() {
        String filePath = "C:\\Users\\Bing\\Desktop\\learn\\news2.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + " 删除成功");
            } else {
                System.out.println(filePath + " 删除失败");
            }
        } else {
            System.out.println("该目录不存在...");
        }
    }

    @Test
    public void m3() {
        String directoryPath = "C:\\Users\\Bing\\Desktop\\learn\\a";
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println(directoryPath + " 存在...");
        } else {
            if (file.mkdir()) {
                System.out.println(directoryPath + " 创建成功...");
            } else {
                System.out.println(directoryPath + " 创建失败...");
            }
        }
    }
}
