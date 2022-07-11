package chapter11;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Mr.Xiao
 * @date 2022/06/04 10:48
 * @Contain
 **/
public class ArrayExercise {
    public static void main(String[] args) {

        Book[] books = new Book[4];
        books[0] = new Book("javascript", 100);
        books[1] = new Book("python", 90);
        books[2] = new Book("青年文摘20年", 5);
        books[3] = new Book("JAVA从入门到放弃~", 300);

        //(1)price从大到小?
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                double priceVal = o2.getPrice() - o1.getPrice();
                if(priceVal > 0) {
                    return 1;
                }else if(priceVal < 0) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });

        System.out.println(Arrays.toString(books));
    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
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
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
