package chapter19.inputstream_;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Mr.Xiao
 * @date 2022/07/15 22:54
 * @Contain
 **/
@SuppressWarnings("all")
public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        String filePath = "C:\\Users\\Bing\\Desktop\\learn\\data.dat";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());

        Object dog = ois.readObject();
        System.out.println("运行类型=" + dog.getClass());
        System.out.println("dog信息=" + dog);

        ois.close();
    }
}
