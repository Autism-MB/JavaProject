package chapter17.syn;

/**
 * @author Mr.Xiao
 * @date 2022/07/05 22:46
 * @Contain
 **/
@SuppressWarnings("all")
public class SellTicket {
    public static void main(String[] args) {
        SellTicket03 sellTicket03 = new SellTicket03();
        Thread thread01 = new Thread(sellTicket03);
        Thread thread02 = new Thread(sellTicket03);
        Thread thread03 = new Thread(sellTicket03);
        thread01.start();
        thread02.start();
        thread03.start();
    }
}

@SuppressWarnings("all")
class SellTicket03 implements Runnable {

    private int ticketNum = 100;
    private boolean loop = true;

    public synchronized void sell() {
        if (ticketNum <= 0) {
            System.out.println("售票结束...");
            loop = false;
            return;
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票" + "剩余票数=" + (--ticketNum));

    }

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
}
