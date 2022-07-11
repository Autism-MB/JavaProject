package chapter7;

/**
 * @author Mr.Xiao
 * @date 2022/05/02 10:54
 * @Contain 汉诺塔问题
 **/
public class HanoiTower {
    public static void main(String[] args) {
        Tower tower = new Tower();
        tower.move(3,'A','B','C');
    }
}
class Tower{
    public void move(int num, char a, char b, char c){
        if(num == 1){
            System.out.println(a + "->" + c);
        }else {
            move(num - 1, a, c, b);
            System.out.println(a + "->" + c);
            move(num - 1, b, a, c);
        }
    }
}
