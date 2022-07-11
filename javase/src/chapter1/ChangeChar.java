package chapter1;

/**
 * @author Mr.Xiao
 * @date 2022/04/29 15:31
 * @Contain 转义字符的使用
 **/
public class ChangeChar {
    public static void main(String[] args) {
        // \t 制表符
        System.out.println("北京\t上海\t深圳\t");
        // \n 换行符
        System.out.println("habd\ndddd");
        // \\: 一个\
        System.out.println("dddd\\ddd");
        // \": 一个"
        System.out.println("dwwada\"");
        // \': 一个'
        System.out.println("dwdaa\'");
        // \r: 一个回车
        System.out.println("dwadad\rdwa");


    }
}
