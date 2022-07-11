package chapter8.tesk;

/**
 * @author Mr.Xiao
 * @date 2022/05/08 13:07
 * @Contain
 **/
public class Manager extends Employee{

    private double bonus;

    public Manager(String name, double daySal, int workdays, double grade) {
        super(name, daySal, workdays, grade);
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.println("经理 " + getName() + " 工资是" + bonus + getDaySal() * getWorkdays() * getGrade());
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
