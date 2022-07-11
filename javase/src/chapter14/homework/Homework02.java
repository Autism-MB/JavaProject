package chapter14.homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Mr.Xiao
 * @date 2022/06/27 11:50
 * @Contain
 **/
@SuppressWarnings("all")
public class Homework02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car1 = new Car("宝马", 1023.22);
        Car car2 = new Car("奔驰", 3023.22);
        Car car3 = new Car("奥迪", 2023.22);
        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);

        arrayList.remove(car1);

        arrayList.contains(car2);

        System.out.println(arrayList.size());

        System.out.println(arrayList.isEmpty());

        System.out.println(arrayList);
        arrayList.addAll(arrayList);

        arrayList.containsAll(arrayList);

        arrayList.removeAll(arrayList);

        for (Object o: arrayList) {
            System.out.println(o);
        }

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
