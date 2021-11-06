class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        car1.createCar("Reno", 90, 10000);
        try {
            car1.start();
            System.out.println("Автомобиль завелся");
        } catch (Exception e) {
            System.out.println("Ошибка");
            e.printStackTrace();
        }

        car2.createCar("Opel", 120,8000);
        try {
            car2.start();
            System.out.println("Автомобиль завелся");
        } catch (Exception e) {
            System.out.println("Ошибка");
            e.printStackTrace();
        }



    }
}
