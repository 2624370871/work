package car.entity;

public class Car {
    private int id,price,age;
    private String color,brand;

    // 构造函数
    public Car(int id,int price, int age, String color, String brand) {
        this.id = id;
        this.price = price;
        this.age = age;
        this.color = color;
        this.brand = brand;
    }

    // getter 和 setter 方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", price=" + price +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
