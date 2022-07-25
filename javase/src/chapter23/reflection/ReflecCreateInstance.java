package chapter23.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Mr.Xiao
 * @date 2022/07/26 20:57
 * @Contain 演示通过反射机制创建实例
 **/
@SuppressWarnings("all")
public class ReflecCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //1. 先获取到User类的Class对象
        Class<?> userClass = Class.forName("chapter23.reflection.User");
        //2. 通过public 的无参构造器创建实例
        Object o = userClass.newInstance();
        System.out.println(o);
        //3. 通过public 的有参构造器创建实例
        Constructor<?> constructor = userClass.getConstructor(String.class);
        Object xiaomin = constructor.newInstance("xiaomin");
        System.out.println("xiaomin = " + xiaomin);
        //4. 通过非public 的有参构造器创建实例
        //得到 private 的构造器对象
        Constructor<?> declaredConstructor = userClass.getDeclaredConstructor(int.class, String.class);
//        System.out.println(declaredConstructor);
        declaredConstructor.setAccessible(true); //暴力破解 使用反射可以访问private构造器
        Object xmb = declaredConstructor.newInstance(10, "xmb");
        System.out.println(xmb);
    }
}

@SuppressWarnings("all")
class User {
    private int age;
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}