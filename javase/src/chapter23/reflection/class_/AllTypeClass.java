package chapter23.reflection.class_;

import java.io.Serializable;

/**
 * @author Mr.Xiao
 * @date 2022/07/25 20:25
 * @Contain 演示哪些类型有Class对象
 **/
@SuppressWarnings("all")
public class AllTypeClass {
    public static void main(String[] args) {
        Class<String> aClass1 = String.class;
        Class<Serializable> aClass2 = Serializable.class;
        Class<Integer[]> aClass3 = Integer[].class;
        Class<float[][]> aClass4 = float[][].class;
        Class<Deprecated> aClass5 = Deprecated.class;
        Class<Thread.State> aClass6 = Thread.State.class;
        Class<Long> aClass7 = long.class;
        Class<Void> aClass8 = void.class;
        Class<Class> aClass9 = Class.class;
 
        System.out.println(aClass1);
        System.out.println(aClass2);
        System.out.println(aClass3);
        System.out.println(aClass4);
        System.out.println(aClass5);
        System.out.println(aClass6);
        System.out.println(aClass7);
        System.out.println(aClass8);
        System.out.println(aClass9);

    }
}
