package chapter19.writer_;

/**
 * @author Mr.Xiao
 * @date 2022/07/13 21:50
 * @Contain 做成处理流/包装流
 **/
@SuppressWarnings("all")
public class BufferedReader_ extends Reader_ {

    private Reader_ reader_;

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    //让方法更加灵活,多次读取文件
    public void readFiles(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }

    //扩展 readString,批量处理字符串数据
    public void readStrings(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }
}
