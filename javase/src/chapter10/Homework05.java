package chapter10;

/**
 * @author Mr.Xiao
 * @date 2022/05/23 20:33
 * @Contain
 **/
public class Homework05 {
    public static void main(String[] args) {

    }
}


class A{
    private String NAME = "hello";
    public void f1() {
        class B {
            private final String NAME = "肖茂彬";
            public void show() {
                System.out.println("NAME= " + NAME + "外部类的NAME" + A.this.NAME);
            }
        }
    }
}