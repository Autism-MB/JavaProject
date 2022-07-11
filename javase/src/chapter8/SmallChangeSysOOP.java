package chapter8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Mr.Xiao
 * @date 2022/05/04 19:00
 * @Contain 完成零钱通各个功能的类
 * 使用OOP(面向对象编程)
 **/
public class SmallChangeSysOOP {

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

    //显示菜单
    public void mainMenu(){
        do{
            System.out.println("\n==========零钱通菜单(OOP)==========");
            System.out.println("1. 零钱通明细");
            System.out.println("2. 收益入账");
            System.out.println("3. 消费");
            System.out.println("4. 退出");

            System.out.println("请选择(1-4): ");
            key = scanner.next();

            //使用switch
            switch (key){
                case "1":
                    this.detail();
                    break;
                case "2":
                   this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误,请重新选择");

            }
        }while(loop);

        System.out.println("-----退出了零钱通项目-----");
    }

    //完成零钱通明细
    public void detail(){
        System.out.println(details);
    }

    //完成收益入账
    public void income(){
        System.out.print("收益入账金额:");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("收益入账金额 需要大于0");
            return;
        }
        balance += money;
        date = new Date(); //获取当前日期
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //完成消费
    public void pay(){
        System.out.println("消费金额:");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("你的消费金额 应该在0-" + balance);
            return;
        }
        System.out.println("消费说明:");
        note = scanner.next();
        balance -= money;
        date = new Date(); //获取当前日期
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //退出
    public void exit(){
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
    }

}
