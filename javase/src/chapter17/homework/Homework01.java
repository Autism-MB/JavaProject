package chapter17.homework;

import java.util.Scanner;

/**
 * @author Mr.Xiao
 * @date 2022/07/06 23:04
 * @Contain
 **/
public class Homework01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }
}

@SuppressWarnings("all")
class A extends Thread {

    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            System.out.println((int) (Math.random() * 100 + 1));
        }
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

@SuppressWarnings("all")
class B extends Thread {

    private A a;
    private Scanner scanner = new Scanner(System.in);

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("请输入‘Q’的命令: ");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                a.setLoop(false);
                break;
            }
        }
    }
}