package chapter19.properties_;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Mr.Xiao
 * @date 2022/07/17 10:50
 * @Contain
 **/
@SuppressWarnings("all")
public class Properties01 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("javase\\mysql.properties"));
        properties.list(System.out);

        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        String ip = properties.getProperty("ip");
        System.out.println("用户名=" + user);
        System.out.println("密码=" + pwd);
        System.out.println("ip地址=" + ip);
    }
}
