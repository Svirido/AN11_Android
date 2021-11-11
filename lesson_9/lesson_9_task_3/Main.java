import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        input();
        inputBlackList();
        check();
    }

    public static void input() throws IOException {
        FileWriter fw = new FileWriter("C:\\work_folder\\Android_developer\\TeachMeSkills\\Java\\Project\\9\\lesson9task3\\out\\production\\lesson9task3\\line.txt");
        String text = "Неспокойная наша родная река. Она мадам. Я и раньше ходил в лес гулять и ставил шалаш. Сельский букет стоял на столе. Это была большая льдина. У ног толкуют волны. С одной из лесных полян я увидел высокую многоцветную грозу.";
        fw.write(text);
        fw.close();
    }

    public static void inputBlackList() throws IOException {
        FileWriter fw2 = new FileWriter("C:\\work_folder\\Android_developer\\TeachMeSkills\\Java\\Project\\9\\lesson9task3\\out\\production\\lesson9task3\\blacklist.txt");
        String text = "букет кино была";
        fw2.write(text);
        fw2.close();
    }

    public static void check() throws IOException {
        FileReader fr = new FileReader("C:\\work_folder\\Android_developer\\TeachMeSkills\\Java\\Project\\9\\lesson9task3\\out\\production\\lesson9task3\\line.txt");
        FileReader fr2 = new FileReader("C:\\work_folder\\Android_developer\\TeachMeSkills\\Java\\Project\\9\\lesson9task3\\out\\production\\lesson9task3\\blacklist.txt");
        Scanner in = new Scanner(fr);
        Scanner in2 = new Scanner(fr2);
        String line = in.nextLine();
        String blackList = in2.nextLine();
        String str2 = line.replace(".", "");

        String[] str3 = str2.split(" "); // текст по словам
        String[] str4 = blackList.split(" "); // недопустимые слова

        int counter = 0;
        for (int i = 0; i < str3.length; i++) {
            for (int j = 0; j < str4.length; j++) {
                if (str3[i].equals(str4[j])) {
                    System.out.println("Текст НЕ прошёл проверку на цензуру. Слово: " + str4[j]); // todo - предложение полностью
                    counter++;
                }
            }
        }
        System.out.println("Количество слов не прошедших цензуру = " + counter);
    }
}
