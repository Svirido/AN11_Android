class Passenger extends Terrestrial { // легковой

    String body = "Hatchback"; // Тип кузова
    int passengers = 100; // Кол-во пассажиров
    private double powerKilowatts; // Мощность в киловаттах (кВ)

    double time = 150; // время (в минутах)
    double distance = 0; // сколько километров проедет машина двигаясь с максимальной скоростью
    double fuelItog = 0; // к-во израсходованного топлива


    double powerKilowatts(int power) {
        this.power = power;
        powerKilowatts = power * 0.74;
        return powerKilowatts;
    }

    void printPassenger() {
        System.out.println("Мощность = " + power + " Максимальная скорость = " + maxSpeed + " Масса = " + weight +
                " Марка = " + brand + " Количество колёс = " + wheels + " Расход топлива = " + fuel +
                " Тип кузова = " + body + " Кол-во пассажиров " + passengers + " Мощность в киловаттах " + powerKilowatts);
    }


    double calculationDistance(double time) {
        this.time = time;
        distance = (time/60)  * maxSpeed;
        distance = Math.round(distance * 100.0) / 100.0;
        return distance;

    }


    double calculatorFuel(double distance) {  // нужно сделать его private !!!
        this.distance = distance;
        fuelItog = (distance / 100) * fuel;
        fuelItog = Math.round(fuelItog * 10.0) / 10.0;
        return fuelItog;
    }

}
