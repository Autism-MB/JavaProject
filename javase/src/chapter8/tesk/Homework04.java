package chapter8.tesk;

/**
 * @author Mr.Xiao
 * @date 2022/05/08 11:07
 * @Contain
 **/
public class Homework04 {
    public static void main(String[] args) {
        Manager manager = new Manager("刘备", 100, 20, 1.2);
        manager.setBonus(3000);
        manager.printSal();
    }
}
