package chapter23.reflection.class_;

/**
 * @author Mr.Xiao
 * @date 2022/07/25 20:01
 * @Contain
 **/
@SuppressWarnings("all")
public class Car {
    public String brand = "宝马";
    public int price = 5000;
    public String color = "白色";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
