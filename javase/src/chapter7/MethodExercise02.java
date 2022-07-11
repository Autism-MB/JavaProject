package chapter7;

/**
 * @author Mr.Xiao
 * @date 2022/05/01 19:22
 * @Contain
 **/
public class MethodExercise02 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "alll";
        p.age = 100;

        MyTools tools = new MyTools();
        Person p2 = tools.copyPerson(p);
        System.out.println("p的属性 age=" + p.age + "名字是= " + p.name);
        System.out.println("p的属性 age=" + p2.age + "名字是= " + p2.name);
        System.out.println("p的hashcode  = " + p.hashCode());
        System.out.println("p的hashcode  = " + p2.hashCode());

    }
}
class Person{
    String name;
    int age;
}
class MyTools{
    public Person copyPerson(Person p){
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}