package chapter23.reflection.class_;

/**
 * @author Mr.Xiao
 * @date 2022/07/25 20:14
 * @Contain 获取Class对象的六种方式
 **/
@SuppressWarnings("all")
public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. Class.forName
        String classAllPath = "chapter23.reflection.class_.Car";
        Class<?> aClass1 = Class.forName(classAllPath);
        System.out.println(aClass1);

        //2. 类名.Class 应用场景：用于参数传递
        Class aClass2 = Car.class;
        System.out.println(aClass2);

        //3. 对象.getClass() 应用场景：有对象实例
        Car car = new Car();
        Class aClass3 = car.getClass();
        System.out.println(aClass3);

        //4. 通过类加载器 [4种] 来获取到类的Class对象
        ClassLoader classLoader = car.getClass().getClassLoader();
        Class aClass4 = classLoader.loadClass(classAllPath);
        System.out.println(aClass4);
    }
}
