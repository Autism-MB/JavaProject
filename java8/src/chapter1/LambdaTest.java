package chapter1;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

/**
 * @author Mr.Xiao
 * @date 2022/07/19 22:40
 * @Contain
 **/
@SuppressWarnings("all")
public class LambdaTest {

    @Test
    public void Test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("第一种方式");
            }
        };
        r1.run();
        System.out.println("===================");

        Runnable r2 = ()-> {
            System.out.println("Lambda方式");
        };
        r2.run();
    }

    @Test
    public void Test2() {

        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(01, 02);
            }
        };
        com1.compare(12, 21);
    }
}
