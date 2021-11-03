import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String line = in.nextLine();

        int A = line.indexOf('A');
        int B = line.lastIndexOf('B');

        String line1 = line.substring(A + 1, B);
        System.out.println(line1);

    }
}
