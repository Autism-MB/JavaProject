package chapter8.tesk;

/**
 * @author Mr.Xiao
 * @date 2022/05/04 21:06
 * @Contain
 **/
public class Professor  extends Teacher{
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("这是教授的信息 ");
        super.introduce();
    }
}
