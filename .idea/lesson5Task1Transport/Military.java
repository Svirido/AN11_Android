class Military extends Air { //военный

    boolean ejection = true; // Наличие системы катапультирования (true/false)
    int rockets = 8; // Кол-во ракет на борту
    private double powerKilowatts; // Мощность в киловаттах (кВ)


    double powerKilowatts (int power){
        this.power = power;
        powerKilowatts = power * 0.74;
        return powerKilowatts;
    }


    void printMilitary(){
        System.out.println("Мощность = " + power + " Максимальная скорость = " + maxSpeed + " Масса = " + weight +
                " Марка = " + brand + " Размах крыльев = " + wingspan +
                " Минимальная длина взлётно-посадочной полосы для взлёта = " + runwayStrip +
                " Наличие системы катапультирования = " + ejection + " Кол-во ракет на борту = " + rockets +
                " Мощность в киловаттах " + powerKilowatts);
    }

    void shot(int rockets){
        this.rockets = rockets;
        if (rockets != 0) System.out.println("\nРакета пошла…");
        else System.out.println("\nБоеприпасы отсутствуют");
    }

    void bailout(boolean ejection){
        this.ejection = ejection;
        if (ejection) System.out.println("\nКатапультирование прошло успешно");
        else System.out.println("\nУ вас нет такой системы");
    }


}
