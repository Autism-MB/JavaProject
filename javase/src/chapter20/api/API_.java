package chapter20.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Mr.Xiao
 * @date 2022/07/17 22:57
 * @Contain
 **/
@SuppressWarnings("all")
public class API_ {
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println(localhost);

//            InetAddress host2 = InetAddress.getByName("ThinkPad-PC");
//            System.out.println(host2);
//
//            InetAddress host3 = InetAddress.getByName("https:\\shaw1231.top");
//            System.out.println(host3);
//
//            String host3Name = host3.getHostName();
//            System.out.println(host3Name);
//
//            String host3Address = host3.getHostAddress();
//            System.out.println(host3Address);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
