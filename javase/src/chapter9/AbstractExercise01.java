package chapter9;

/**
 * @author Mr.Xiao
 * @date 2022/05/19 16:14
 * @Contain
 **/
public class AbstractExercise01 {
    public static void main(String[] args) {
        Mananger mananger = new Mananger("tom", 1, 5000);
        mananger.setBonus(4000);
        mananger.work();

        CommonEmployee commonEmployee = new CommonEmployee("jack", 2, 6000);
        commonEmployee.work();
    }
}
