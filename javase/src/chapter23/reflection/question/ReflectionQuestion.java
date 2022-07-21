package chapter23.reflection.question;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author Mr.Xiao
 * @date 2022/07/24 10:04
 * @Contain
 **/
@SuppressWarnings("all")
public class ReflectionQuestion {
    public static void main(String[] args) throws Exception {

        //1.使用Properties 类,可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("javase\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println("classfullpath" + classfullpath);
        System.out.println("method" + method);

        //3. 使用反射机制解决
        //(1) 加载类, 返回Class类型的对象cls
        Class aClass = Class.forName(classfullpath);
        //(2) 通过 cls 得到加载的类 的对象实例
        Cat o = (Cat) aClass.newInstance();
        System.out.println("o的运行类型=" + o.getClass());
        //(3) 通过 cls 得到你加载的类 的methodName的方法对象
        Method method1 = aClass.getMethod(method);
        System.out.println("=======================");
        method1.invoke(o);
    }
}
