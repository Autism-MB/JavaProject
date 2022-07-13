package chapter19.writer_;

import java.io.*;

/**
 * @author Mr.Xiao
 * @date 2022/07/14 23:12
 * @Contain
 **/
@SuppressWarnings("all")
public class BufferedCopy_ {
    public static void main(String[] args) {

        String srcFilePath = "C:\\JavaProject\\javase\\src\\chapter19\\writer_\\Test_.java";
        String destFilePath = "C:\\JavaProject\\javase\\src\\chapter19\\writer_\\Test1_.java";

        BufferedReader br = null;
        BufferedWriter bw = null;

        String Line;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));

            while ((Line = br.readLine()) != null) {
                bw.write(Line);
                bw.newLine();
            }

            System.out.println("拷贝完毕！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }

                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
