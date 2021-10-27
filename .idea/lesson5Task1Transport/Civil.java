class Civil extends Air { //гражданский

    int passengers = 50; // Кол-во пассажиров
    boolean business = true; // Наличие бизнес класса (true/false)
    private double powerKilowatts; // Мощность в киловаттах (кВ)

    int passengers2;



    double powerKilowatts (int power){
        this.power = power;
        powerKilowatts = power * 0.74;
        return powerKilowatts;
    }


    void printCivil(){
        System.out.println("Мощность = " + power + " Максимальная скорость = " + maxSpeed + " Масса = " + weight +
                " Марка = " + brand + " Размах крыльев = " + wingspan +
                " Минимальная длина взлётно-посадочной полосы для взлёта = " + runwayStrip +
                " Кол-во пассажиров " + passengers + " Наличие бизнес класса " + business +
                " Мощность в киловаттах " + powerKilowatts);
    }


    void passengersCheck (int passengers2){
        this.passengers2 = passengers2;
        if (passengers >= passengers2) System.out.println("Все пассажиры на борту");
        else System.out.println("Вам нужен самолёт побольше");
    }

}
