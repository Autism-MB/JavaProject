package chapter23.reflection;

import java.lang.reflect.Field;

/**
 * @author Mr.Xiao
 * @date 2022/07/26 21:17
 * @Contain 反射暴破操作属性
 **/
@SuppressWarnings("all")
public class ReflecAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //1. 得到 Student类对应的Class对象
        Class<?> stuClass = Class.forName("chapter23.reflection.Student");
        //2. 创建对象
        Object o = stuClass.newInstance();
        System.out.println(o.getClass());
        //3. 使用反射得到 age 属性对象
        Field age = stuClass.getField("age");
        age.set(o, 12);
        System.out.println(o);
        System.out.println(age.get(o));
        //4. 使用反射操作 name 属性
        Field name = stuClass.getDeclaredField("name");
        //对 name 进行暴破, 可以操作private 属性
        name.setAccessible(true);
//        name.set(o, "xmb");
        name.set(null, "老韩");
        System.out.println(o);
        System.out.println(name.get(o));
    }
}

@SuppressWarnings("all")
class Student {
    public int age;
    private static String name;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                "name=" + name +
                '}';
    }
}
