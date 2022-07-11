package chapter14.homework;

import java.util.ArrayList;

/**
 * @author Mr.Xiao
 * @date 2022/06/27 11:36
 * @Contain
 **/
@SuppressWarnings("all")
public class Homework01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新冠疫情11111111111111111111"));
        arrayList.add(new News("男子的11111111111111111111111"));

        int size = arrayList.size();

        for (int i = size - 1; i >= 0 ; i--) {
//            System.out.println(arrayList.get(i));
            News news = (News) arrayList.get(i);
            System.out.println(processTitle(news.getTitle()));
        }

    }

    //写一个方法,处理现实新闻标题,process处理
    public static String processTitle(String title) {
        if (title == null) {
            return "";
        }
        if (title.length() > 15) {
            return title.substring(0, 15) + "...";
        } else {
            return title;
        }
    }
}

class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}
