package chapter15;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Mr.Xiao
 * @date 2022/06/25 15:41
 * @Contain
 **/
@SuppressWarnings("all")
public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom", 20000, new MyDate(2000, 11, 11)));
        employees.add(new Employee("jcak", 50000, new MyDate(2001, 12, 12)));
        employees.add(new Employee("xmb", 30000, new MyDate(2001, 01, 19)));

        System.out.println("employees" + employees);

        System.out.println("==============================");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)) {
                    System.out.println("类型不准确");
                    return 0;
                }
                //比较name
                int i = emp1.getName().compareTo(emp2.getName());
                if (i != 0) {
                    return i;
                }
                //如果year 和 month
                return emp1.getBirthday().compareTo(emp2.getBirthday());
            }
        });

        System.out.println("employees" + employees);
    }
}
