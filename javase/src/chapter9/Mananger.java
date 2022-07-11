package chapter9;

/**
 * @author Mr.Xiao
 * @date 2022/05/19 16:11
 * @Contain
 **/
public class Mananger extends Employee{

    private double bonus;

    public Mananger(String name, int id, double salary) {
        super(name, id, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理" + getName() + "工作中....");
    }
}
