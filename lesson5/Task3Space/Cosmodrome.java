class Cosmodrome implements IStart {

    double randomNumber = 0.0;

    @Override
    public boolean check() {
        randomNumber = 0 + Math.random()*10;
        System.out.println("Случайное число = " + randomNumber);
        if (randomNumber > 3) return true;
        else return false;
    }



    @Override
    public void engineStart() {
        System.out.println(" - Обратный отсчёт 10..9..8..7..6..5..4..3..2..1");
    }

    @Override
    public void start() {
        System.out.println(" - Запуск двигателя");
    }

    public void launch() {
        System.out.println("КОСМОДРОМ:");
        if (!check()) System.out.println(" - Предстартовая проверка провалена");
        else {
            engineStart();
            start();
        }
    }

}
