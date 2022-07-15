package chapter19.standard;

import java.util.Scanner;

/**
 * @author Mr.Xiao
 * @date 2022/07/17 10:13
 * @Contain
 **/
@SuppressWarnings("all")
public class InputAndOutput {
    public static void main(String[] args) {

        //System 类的 public static final InputStream in = null;
        //System.in 编译类型  InputStream
        //System.in 运行类型  BufferedInputStream
        System.out.println(System.in.getClass());


        //System 类的 public static final PrintStream out = null;
        //System.in 编译类型  PrintStream
        //System.in 运行类型  PrintStream
        System.out.println(System.out.getClass());

        System.out.println("hello 肖茂彬");

        Scanner scanner = new Scanner(System.in);
        String next =  scanner.next();
        System.out.println("next= " + next);
    }
}
