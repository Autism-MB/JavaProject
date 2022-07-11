package chapter15;

import org.junit.Test;

import java.util.List;

/**
 * @author Mr.Xiao
 * @date 2022/06/27 15:37
 * @Contain
 **/
@SuppressWarnings("all")
public class Homework01 {
    public static void main(String[] args) {

    }

    @Test
    public void testList() {
        DAO<User> dao = new DAO<>();
        dao.save("001", new User(1,10,"jack"));
        dao.save("002", new User(2,30,"tom"));
        dao.save("003", new User(3,20,"smith"));

        List<User> list = dao.list();
        System.out.println(list);

        dao.save("003", new User(3,58,"maith"));
        System.out.println("修改后============");

        list = dao.list();
        System.out.println("list =" + list);
    }
}
