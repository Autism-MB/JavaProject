package chapter23.reflection.class_;

import java.lang.reflect.Field;

/**
 * @author Mr.Xiao
 * @date 2022/07/25 19:54
 * @Contain 演示Class类的常用方法
 **/
@SuppressWarnings("all")
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classAllPath = "chapter23.reflection.class_.Car";
        Class<?> aClass = Class.forName(classAllPath);
        System.out.println(aClass);
        System.out.println(aClass.getClass());//运行类型
        System.out.println(aClass.getPackage().getName()); //包名
        //全类名
        System.out.println(aClass.getName());
        //创建对象实例
        Car car = (Car) aClass.newInstance();
        System.out.println(car);
        //通过反射获取属性 brand
        Field brand = aClass.getField("brand");
        System.out.println(brand.get(car));
        //通过反射给属性赋值
        brand.set(car, "奔驰");
        System.out.println(brand.get(car));

        Field[] fields = aClass.getFields();
        for (Field f: fields) {
            System.out.println(f.getName());
        }
    }
}
