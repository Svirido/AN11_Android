import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Для легкового авто
        Passenger passenger1 = new Passenger();
        System.out.println("Введите время (в минутах)");
        double time = in.nextDouble();
        double time2 = Math.round((time/60) * 10.0) / 10.0;
        passenger1.calculationDistance(time);
        passenger1.calculatorFuel(passenger1.distance);
        System.out.println("За время " + time2  + " ч, автомобиль " + passenger1.brand + " двигаясь с максимальной скоростью " +
                passenger1.maxSpeed + " км/ч. проедет " + passenger1.distance + " км. и израсходует " + passenger1.fuelItog + " литров топлива ");


        // Для грузового авто
        Cargo cargo1 = new Cargo();
        System.out.println("\nВведите  кол-во груза");
        int capacity2 = in.nextInt();
        cargo1.capacityCheck(capacity2);

        // Для гражданских самолётов
        Civil civil1 = new Civil();
        System.out.println("\nВведите  кол-во пасажиров");
        int passengers2 = in.nextInt();
        civil1.passengersCheck(passengers2);

        // Для военных самолётов
        Military military1 = new Military();
        military1.shot(military1.rockets);
        military1.bailout(military1.ejection);


    }

}
