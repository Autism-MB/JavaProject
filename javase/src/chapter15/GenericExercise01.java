package chapter15;

import java.util.*;

/**
 * @author Mr.Xiao
 * @date 2022/06/25 15:24
 * @Contain
 **/
@SuppressWarnings("all")
public class GenericExercise01 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("jack", 18));
        students.add(new Student("tom", 28));
        students.add(new Student("mary", 19));

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("=================================");
        HashMap<String, Student> hashMap = new HashMap<>();
        hashMap.put("jack", new Student("jack", 18));
        hashMap.put("tom", new Student("tom", 28));
        hashMap.put("mary", new Student("mary", 19));

        Set<Map.Entry<String, Student>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
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
