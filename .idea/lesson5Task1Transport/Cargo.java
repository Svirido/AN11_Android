class Cargo extends Terrestrial { // грузовой

    int capacity = 5; //Грузоподъёмность(т)
    private double powerKilowatts; // Мощность в киловаттах (кВ)

    int capacity2; //Грузоподъёмность(т)

    double powerKilowatts(int power) {
        this.power = power;
        powerKilowatts = power * 0.74;
        return powerKilowatts;
    }

    void printCargo() {
        System.out.println("Мощность = " + power + " Максимальная скорость = " + maxSpeed + " Масса = " + weight +
                " Марка = " + brand + " Количество колёс = " + wheels + " Расход топлива = " + fuel +
                " Грузоподъёмность = " + capacity + " Мощность в киловаттах " + powerKilowatts);
    }

    void capacityCheck (int capacity2){
        this.capacity2 = capacity2;
        if (capacity >= capacity2) System.out.println("Грузовик загружен");
        else System.out.println("Вам нужен грузовик побольше");
    }


}
