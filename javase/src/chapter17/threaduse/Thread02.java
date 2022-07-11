package chapter17.threaduse;

/**
 * @author Mr.Xiao
 * @date 2022/06/28 12:42
 * @Contain
 **/
@SuppressWarnings("all")
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Thread thread = new Thread(dog);
        thread.start();


    }
}

@SuppressWarnings("all")
class Dog implements Runnable {

    int count = 0;
    @Override
    public void run() {
        while (true) {

            System.out.println("小狗汪汪叫..hi " + (++count) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (count == 10) {
                break;
            }
        }
    }
}
