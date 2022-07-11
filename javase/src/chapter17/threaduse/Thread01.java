package chapter17.threaduse;

/**
 * @author Mr.Xiao
 * @date 2022/06/28 10:35
 * @Contain
 **/
@SuppressWarnings("all")
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {

        Cat cat = new Cat();
        cat.start();

        System.out.println("主线程继续执行" + Thread.currentThread().getName());
        for (int i = 0; i < 6; i++) {
            System.out.println("主线程 i=" + i);
            Thread.sleep(1000);
        }
    }
}
//1. 当一个类继承了 Thread类,该类就可以当做线程使用
//2. 我们会重写run方法
@SuppressWarnings("all")
class Cat extends Thread {

    int times = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("喵喵我是小猫咪" + (++times));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (times == 8) {
                break;
            }
        }
    }
}
