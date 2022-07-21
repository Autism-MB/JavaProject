package chapter23.reflection;

import chapter23.reflection.question.Cat;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Mr.Xiao
 * @date 2022/07/24 22:07
 * @Contain
 **/
@SuppressWarnings("all")
public class Reflection02 {
    public static void main(String[] args) {

    }

    @Test
    //传统方法调用m1
    public void m1() {
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        //m1() 耗时=8
        System.out.println("m1() 耗时=" + (end - start));
    }

    @Test
    //反射机制调用m2
    public void m2() throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("chapter23.reflection.question.Cat");
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        //m2() 耗时=6
        System.out.println("m1() 耗时=" + (end - start));
    }

    @Test
    //反射机制调用m3 优化
    public void m3() throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("chapter23.reflection.question.Cat");
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");
        hi.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        //m2() 耗时=6
        System.out.println("m3() 耗时=" + (end - start));
    }
}
