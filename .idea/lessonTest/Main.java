public class Main {
    public static void main(String[] args) {

        Test itog = new Test();

        itog.vvod(); // вводим данные о пациенте

        itog.printInfo(); // печать данных о пациенте

        System.out.println("\nРезультат тестов:");

        itog.testSick(); // тест

        itog.print(); // вывод на печать результатов теста

        itog.antibodyresult(); // расчёт количества антител

        itog.printantibody(); // вывод на печать количесвта антител

    }
}
