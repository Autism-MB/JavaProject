package chapter23.reflection.homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Mr.Xiao
 * @date 2022/07/26 21:59
 * @Contain
 **/
@SuppressWarnings("all")
public class Homework01 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<?> PrivateTestClass = Class.forName("chapter23.reflection.homework.PrivateTest");
        Object Private = PrivateTestClass.newInstance();
        Field name = PrivateTestClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(Private, "hello");
        Method getName = PrivateTestClass.getMethod("getName");
        Object invoke = getName.invoke(Private);
        System.out.println("name属性值= " + invoke);
    }
}

@SuppressWarnings("all")
class PrivateTest {
    private String name = "helloworld";
    public String getName() {
        return name;
    }
}
