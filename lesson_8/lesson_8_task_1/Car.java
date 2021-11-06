public class Car {

    private String brand;
    int speed;
    int price;

    public void createCar(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public static void start() throws Exception {

        double random = 0 + Math.random() * 20;
        int randomNumber = (int) random;

        if (randomNumber % 2 == 0) throw new Exception();
    }
}
