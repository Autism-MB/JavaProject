package chapter14;

import java.util.*;

/**
 * @author Mr.Xiao
 * @date 2022/06/23 16:13
 * @Contain
 **/
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("xx", "bb");
        map.put("lnj", "mr");


        //第一组：把所有的key取出来
        Set keyset = map.keySet();
        System.out.println("---------第一种方式--------");
        for (Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }

        //迭代器
        System.out.println("---------第二种方式--------");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        //第二组：把所有的vaLues取出
        Collection values = map.values();
        System.out.println("---------第一种方式--------");
        for (Object value : values) {
            System.out.println(value);
        }

        //迭代器
        System.out.println("---------第二种方式--------");
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object value = iterator2.next();
            System.out.println(value);
        }

        //第三组：通过EntrySet 来获取
        Set entrySet = map.entrySet();
        System.out.println("----使用EntrySet 的 for增强（第3种）----");
        for (Object entry : entrySet) {
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }

        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object entry = iterator1.next();
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }

    }
}
