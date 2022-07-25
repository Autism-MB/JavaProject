package chapter23.reflection.class_;

/**
 * @author Mr.Xiao
 * @date 2022/07/25 11:00
 * @Contain 对Class类特点的梳理
 **/
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> aClass1 = Class.forName("chapter23.reflection.question.Cat");
        Class<?> aClass2 = Class.forName("chapter23.reflection.question.Cat");

        System.out.println(aClass1.hashCode());
        System.out.println(aClass2.hashCode());
    }
}
