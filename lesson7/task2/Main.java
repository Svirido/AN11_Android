import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String line = in.nextLine();

        char char0 = line.charAt(0);
        char char3 = line.charAt(3);

        String line1 = line.replace(char0, char3);
        System.out.println(line1);

    }
}
