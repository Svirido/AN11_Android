import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите набор чисел чекрез запятую и пробел. Например 1, 2, 3, 4, 4, 5");

        Scanner in = new Scanner(System.in);
        String numbers = in.nextLine();

        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(numbers.split(", ")));
        System.out.println(hashSet);
    }
}
