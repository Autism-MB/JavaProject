package chapter10;

/**
 * @author Mr.Xiao
 * @date 2022/05/23 15:31
 * @Contain
 **/
public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testwork(new Calculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 10, 8);
    }
}


interface Calculate {
    public double work(double n1, double n2);
}

class Cellphone {
    public void testwork(Calculate calculate, double n1, double n2){
        double result = calculate.work(n1, n2);
        System.out.println("计算后的结果是=" + result);
    }
}