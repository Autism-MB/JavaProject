package chapter6;

import java.util.Scanner;

/**
 * @author Mr.Xiao
 * @date 2022/04/30 16:21
 * @Contain 数组扩容
 **/
public class ArrayAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3};
        do{
            int[] arrNew = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            System.out.println("请输入你要输入的数: ");
            int addNum = scanner.nextInt();
            arrNew[arrNew.length - 1] = addNum;
            arr = arrNew;
            System.out.println("数组扩容后的情况: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println("是否继续添加 y/n?");
            char charAt = scanner.next().charAt(0);
            if(charAt == 'n'){
                break;
            }
        }while (true);
        System.out.println("你退出了添加...");
    }
}
