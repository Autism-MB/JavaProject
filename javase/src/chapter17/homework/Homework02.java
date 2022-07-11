package chapter17.homework;

/**
 * @author Mr.Xiao
 * @date 2022/07/07 10:27
 * @Contain
 **/
@SuppressWarnings("all")
public class Homework02 {
    public static void main(String[] args) {
        T t1 = new T();
        Thread thread1 = new Thread(t1);
        thread1.start();
        T t2 = new T();
        Thread thread2 = new Thread(t2);
        thread2 .start();
    }
}

@SuppressWarnings("all")
class T implements Runnable {

    private int money = 10000;

    @Override
    public void run() {

        while (true) {
            synchronized (this) {
                if (money < 1000) {
                    System.out.println("余额不足");
                    break;
                }

                money -= 1000;
                System.out.println(Thread.currentThread().getName() + " 取出了1000 当前余额= " + money);
            }

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
