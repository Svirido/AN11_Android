import java.util.Scanner;

public class Test extends Patient {

    Scanner in = new Scanner(System.in);
    Patient patient1 = new Patient();

    void vvod() {
        System.out.println("\nЕсли пациент носит маску - введите 1. Если не носит - введите 0");
        int m = in.nextInt();
        if (m == 0) patient1.mask = false;
        else patient1.mask = true;

        System.out.println("Если пациент работает на удалёнке - введите 1. Если работает в офисе - введите 0");
        int r = in.nextInt();
        if (r == 0) patient1.remote = false;
        else patient1.remote = true;

        System.out.println("Если пациент переболел - введите 1. Если еще не болел - введите 0");
        int s = in.nextInt();
        if (s == 0) patient1.sick = false;
        else patient1.sick = true;
    }


    void printInfo() {
        System.out.println("\nИнформация о пациенте: ");
        System.out.println("Носит маску - " + patient1.mask);
        System.out.println("Работает на удалёнке - " + patient1.remote);
        System.out.println("Переболел - " + patient1.sick);
        System.out.println("Вакцина - " + patient1.vaccinated);
    }


    boolean testSick() {
        boolean test = true; // перемення для определения более ли пациент

        double x = 1.00; // вероятность заболеть (если меньше 0,5 - false)
        double masx1 = 0;
        double remote1 = 0;
        double sick1 = 0;

        if (patient1.mask) masx1 = 0.25;
        if (patient1.remote) remote1 = 0.6;
        if (patient1.sick) sick1 = 0.3;

        x = x - masx1 - remote1 - sick1;

        if (x < 0.5)
            test = false;
        return test;
    }

    void print() {
        if (testSick())
            System.out.println("Пациент болеет(");
        else
            System.out.println("Пациент не болеет!");
    }

    double antibodyresult() {
        double antibody = 0;
        antibody = antibody + (Math.random() * 100);
        if (patient1.sick)
            antibody = antibody + 50;
        return antibody;
    }

    void printantibody() {
        int y = (int) antibodyresult();
        System.out.println("Количество антител = " + y);
    }
}
