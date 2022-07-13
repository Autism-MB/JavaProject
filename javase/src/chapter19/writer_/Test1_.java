package chapter19.writer_;

/**
 * @author Mr.Xiao
 * @date 2022/07/13 21:59
 * @Contain
 **/
@SuppressWarnings("all")
public class Test1_ {
    public static void main(String[] args) {

        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
        bufferedReader_.readFiles(5);

        BufferedReader_ bufferedReader_1 = new BufferedReader_(new StringReader_());
        bufferedReader_1.readStrings(5);
    }
}
