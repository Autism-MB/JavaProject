package chapter1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author Mr.Xiao
 * @date 2022/07/27 10:20
 * @Contain Lambda表达式的使用
 **/
@SuppressWarnings("all")
public class LambdaTest1 {

    //语法格式一：无参, 无返回值
    @Test
    public void Test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我在那里");
            }
        };
        r1.run();
        System.out.println("=================");
        Runnable r2 = () -> System.out.println("我在这里");
        r2.run();
    }

    @Test
    public void test2() {
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("你好, 世界");
        System.out.println("================");
        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("你好, 中国");
    }

    @Test
    public void test3() {
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("你好, 世界");
        System.out.println("================");
        Consumer<String> con1 = (s) -> {
            System.out.println(s);
        };
        con1.accept("你好, 中国");
    }

    @Test
    public void test4() {
        //类型推断
        ArrayList<String> list = new ArrayList<>();
        int[] arr = {1, 2, 3};
    }

    //语法格式四: Lambda 若只需要一个参数时, 参数的小括号可以省略
    @Test
    public void test5() {
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("你好, 世界");
        System.out.println("================");
        Consumer<String> con1 = s -> {
            System.out.println(s);
        };
        con1.accept("你好, 中国");
    }

    //语法格式五: Lambda 需要两个或以上的参数,多条执行语句,并且可以有返回值
    @Test
    public void test6() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("==========");
        Comparator<Integer> com2 = (o1, o2) -> {
            System.out.println(o1.compareTo(o2));
            return o1.compareTo(o2);
        };
        System.out.println(com2.compare(12, 23));
    }

    //语法格式六: Lambda 需要两个或以上的参数,多条执行语句,并且可以有返回值
    @Test
    public void test7() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("==========");
        Comparator<Integer> com2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com2.compare(12, 23));
    }


}
