package chapter9;

/**
 * @author Mr.Xiao
 * @date 2022/05/19 16:13
 * @Contain
 **/
public class CommonEmployee extends Employee{

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工" + getName() + "工作中....");
    }
}
