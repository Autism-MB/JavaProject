package chapter23.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Mr.Xiao
 * @date 2022/07/26 21:46
 * @Contain
 **/
@SuppressWarnings("all")
public class ReflecAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //1. 得到 Boss类对应的Class对象
        Class<?> bossClass = Class.forName("chapter23.reflection.Boss");
        //2. 创建实例
        Object boss = bossClass.newInstance();
        //3. 调用public 方法
//        Method hi1 = bossClass.getMethod("hi");
        Method hi = bossClass.getDeclaredMethod("hi", String.class);
        hi.invoke(boss, "还是说");

        Method say = bossClass.getDeclaredMethod("say", int.class, String.class, char.class);
        say.setAccessible(true);
        System.out.println(say.invoke(boss, 100, "xxx", '男'));
    }
}

@SuppressWarnings("all")
class Boss {
    public int age;
    private static String name;

    public Boss() {}

    private static String say(int n, String s, char c) {
        return n + " " + s + " " + c;
    }

    public void hi(String name) {
//        this.name = name;
        System.out.println("name = " + name);
    }
}
