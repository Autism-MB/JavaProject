package chapter14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Mr.Xiao
 * @date 2022/06/05 15:14
 * @Contain
 **/
public class CollectionIterator {
    public static void main(String[] args) {
        iterator();
        fors();
        foreach();
    }

    /**
     * 使用Iterator迭代
     * */
    public static void iterator() {
        List<Student> list = new ArrayList<Student>();
        Student student1 = new Student("小明", 18);
        Student student2 = new Student("小红", 19);
        Student student3 = new Student("小白", 20);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=================");
    }

    /**
     * 使用for循环迭代
     * 针对数组集合来说，使用传统的for遍历效率更高
     */
    public static void fors() {
        List<Student> list=new ArrayList<Student>();
        Student stu1=new Student("小刚",16);
        Student stu2=new Student("小花",23);
        Student stu3=new Student("小彬",16);
        list.add(stu1);
        list.add(stu2);
        //使用Iterator迭代
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=================");
    }

    /**
     * 使用foreach迭代
     */
    public static void foreach(){
        List<Student> list = new ArrayList<Student>();
        Student stu1=new Student("小刚",16);
        Student stu2=new Student("小花",23);
        Student stu3=new Student("小彬",16);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        for (Student s:list) {
            System.out.println(s);
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
