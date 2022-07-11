package chapter8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Mr.Xiao
 * @date 2022/05/04 15:44
 * @Contain 零钱通项目
 **/
public class SmallChangeSys {
    //1.显示菜单,并可以选择菜单,给出提示信息
    //2.完成零钱通明细
    public static void main(String[] args) {

        //定义相关变量
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        //完成零钱通明细
        String details = "--------零钱通明细---------";

        //完成收益入账
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String note = "";
        do{
            System.out.println("\n==========零钱通菜单==========");
            System.out.println("1. 零钱通明细");
            System.out.println("2. 收益入账");
            System.out.println("3. 消费");
            System.out.println("4. 退出");

            System.out.println("请选择(1-4): ");
            key = scanner.next();

            //使用switch
            switch (key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("收益入账金额:");
                    money = scanner.nextDouble();
                    if (money <= 0) {
                        System.out.println("收益入账金额 需要大于0");
                        break;
                    }
                    balance += money;
                    date = new Date(); //获取当前日期
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.println("消费金额:");
                    money = scanner.nextDouble();
                    if (money <= 0 || money > balance) {
                        System.out.println("你的消费金额 应该在0-" + balance);
                        break;
                    }
                    System.out.println("消费说明:");
                    note = scanner.next();
                    balance -= money;
                    date = new Date(); //获取当前日期
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    System.out.println("4. 退出");

                    String choice = "";
                    while (true) {
                        System.out.println("你确定要退出吗? y/n");
                        choice = scanner.next();
                        if("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    if (choice.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误,请重新选择");

            }
        }while(loop);

        System.out.println("-----退出了零钱通项目-----");
    }
}
