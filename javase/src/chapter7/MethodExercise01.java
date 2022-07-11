package chapter7;

/**
 * @author Mr.Xiao
 * @date 2022/05/01 16:21
 * @Contain 方法练习
 **/
public class MethodExercise01 {
    public static void main(String[] args) {
        AA a = new AA();
        if(a.isOdd(2)){
            System.out.println("是奇数");
        }else {
            System.out.println("是偶数");
        }
        a.print(4,4, '#');
    }
}
class AA{
    public boolean isOdd(int num){
        return num % 2 != 0;
    }
    public void print(int row, int col, char c){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
