package chapter6;

/**
 * @author Mr.Xiao
 * @date 2022/04/30 11:58
 * @Contain
 **/
public class ArrayExercise02 {
    public static void main(String[] args) {
        int[] a = {4,-1,9,10,23};
        int temp = a[0];
        int maxIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > temp) {
                temp = a[i];
                maxIndex = i;
            }
        }
        System.out.println("数组最大的是：" + temp + "下标为: " + maxIndex);
    }
}
