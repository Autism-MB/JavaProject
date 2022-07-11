package chapter8;

/**
 * @author Mr.Xiao
 * @date 2022/05/02 19:55
 * @Contain
 **/
public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jack");
        account.setBalance(59.0);
        account.setPwd("123456");
        account.showInfo();
    }
}
