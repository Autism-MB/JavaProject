package chapter14.homework;

import java.util.*;

/**
 * @author Mr.Xiao
 * @date 2022/06/27 15:13
 * @Contain
 **/
@SuppressWarnings("all")
public class Homework03 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("jack", 650);
        hashMap.put("tom", 1200);
        hashMap.put("smith", 2900);

        System.out.println(hashMap);

        hashMap.put("jack", 2600);
        System.out.println(hashMap);

        //keySet
        Set set = hashMap.keySet();
        for (Object key: set) {
            hashMap.put(key, (Integer) hashMap.get(key) + 100);
        }
        System.out.println(hashMap);

        //遍历 EntrySet
        Set entrySet = hashMap.entrySet();
        //迭代器
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        Collection values = hashMap.values();
        for (Object value : values) {
            System.out.println("工资=" + value);
        }
    }
}
