package chapter19.outputstream_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Mr.Xiao
 * @date 2022/07/15 22:31
 * @Contain
 **/
@SuppressWarnings("all")
public class ObjectOutStream_ {
    public static void main(String[] args) throws Exception{
        //C:\Users\Bing\Desktop\learn
        String filePath = "C:\\Users\\Bing\\Desktop\\learn\\data.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeDouble(9.9);
        oos.writeUTF("在这种");
        oos.writeObject(new Dog("旺财", 18));

        oos.close();
        System.out.println("数据保存完毕(序列化形式)");
    }
}

@SuppressWarnings("all")
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
