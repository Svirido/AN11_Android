class Shuttle implements IStart {


    @Override
    public boolean check() {
        double randomNumber2 = 0 + Math.random() * 10;
        System.out.println("Случайное число = " + randomNumber2);
        if (randomNumber2 > 3) return true;
        else return false;
    }

    @Override
    public void engineStart() {
        System.out.println(" - Двигатели шатла запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println(" - Старт шатла");
    }

    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();
        cosmodrome.launch();

        Shuttle shuttle = new Shuttle();


        if (cosmodrome.randomNumber > 3) {

            System.out.println("ШАТЛ:");

            if (!shuttle.check()) System.out.println(" - Проверка прошла НЕ успешно");
            else {
                System.out.println(" - Проверка прошла успешно");
                shuttle.engineStart();
                shuttle.start();
            }

        }
    }
}
