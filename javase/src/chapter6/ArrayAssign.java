package chapter6;

/**
 * @author Mr.Xiao
 * @date 2022/04/30 12:04
 * @Contain
 **/
public class ArrayAssign {
    public static void main(String[] args) {
        //基本数据类型赋值方式是值拷贝，n2的变化不会影响n1
        int n1 = 10;
        int n2 = n1;
        n2 = 80;
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);

        //数组默认情况下是引用传递,赋的值是地址,赋值方式是引用传递
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;
        arr2[0] = 10;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
