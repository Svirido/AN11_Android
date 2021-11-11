import java.io.Serializable;

public class Car implements Serializable {

    //private static final long id = 1L;
    String brand;
    int speed;
    int price;

    Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\nSpeed: " + speed + "\nPrice: " + price;
    }

}
