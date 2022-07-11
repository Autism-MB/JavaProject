package chapter6;

/**
 * @author Mr.Xiao
 * @date 2022/04/30 11:54
 * @Contain
 **/
public class ArrayExercise01 {
    public static void main(String[] args) {
        char[] chars = new char[26];
        for(int i = 0; i < chars.length; i++){
            chars[i] = (char)('A' + i);
        }

        System.out.println("====循环输出char数组");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
    }

}
