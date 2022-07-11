package chapter14;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr.Xiao
 * @date 2022/06/06 13:43
 * @Contain List接口的一些常用方法
 **/
public class ListMethod {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("xxx");
        list.add("aaa");
        //void add(int index, Object ele):在index位置插入ele元素
        list.add(1, "yyy");
        System.out.println("list=" + list);
        //boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        List<String> list2 = new ArrayList<String>();
        list2.add("djiofj");
        list2.add("tom");
        list.addAll(1, list2);
        System.out.println("list=" + list);
        //Object get(int index):获取指定index位置的元素
        //int indexOf(Object obj):返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("tom"));
        //int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
        list.add("au");
        System.out.println("list=" + list);
        System.out.println(list.lastIndexOf("au"));
        //Object remove(int index):移除指定index位置的元素,并返回此元素
        list.remove(0);
        System.out.println("list=" + list);
        //Object set(int index, Object ele):设置指定index位置的元素为ele,相当于是替换
        list.set(1, "dd");
        System.out.println("list=" + list);
        //List sublist(int fromIndex,int toIndex):返回从fromIndex到toIndex位置的子集合
        //注意返回的子集合 fromIndex <= subList < toIndex
        List<Object> returnList = list.subList(0, 2);
        System.out.println("returnList=" + returnList);
    }
}
