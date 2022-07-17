package chapter20.upload;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author Mr.Xiao
 * @date 2022/07/18 18:37
 * @Contain
 **/
@SuppressWarnings({"all"})
public class StreamUtils {

    /**
     * 功能：将输入流转换成 byte[],即可以把文件的内容转入到byte[]
     *
     * @param is
     * @return
     * @throws Exception
     */
    public static byte[] streamToByteArray(InputStream is) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        //字节数组
        byte[] b = new byte[1024];
        int len;
        //循环读取
        while ((len = is.read(b)) != -1) {
            //把读取到的数据,写入bos
            bos.write(b, 0, len);
        }
        //然后将bos转成字节数组
        byte[] array = bos.toByteArray();
        bos.close();
        return array;
    }

    /**
     * 功能：将 InputStream 转换成 String
     *
     * @param is
     * @return
     * @throws Exception
     */
    public static String streamToString(InputStream is) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) { //当读取到 null 时，就表示结束
            builder.append(line + "\r\n");
        }
        return builder.toString();

    }
}
