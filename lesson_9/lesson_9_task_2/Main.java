import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        input();
        input2();
    }

    public static void input() throws IOException {
        FileWriter fw = new FileWriter("C:\\work_folder\\Android_developer\\TeachMeSkills\\Java\\Project\\9\\lesson9task2\\out\\production\\lesson9task2\\line.txt");
        String text = "Неспокойная наша родная река. Она мадам. Я и раньше ходил в лес гулять и ставил шалаш. Сельский букет стоял на столе. Это была большая льдина. У ног толкуют волны. С одной из лесных полян я увидел высокую многоцветную грозу.";
        fw.write(text);
        fw.close();
    }

    public static void input2() throws IOException {
        FileReader fr2 = new FileReader("C:\\work_folder\\Android_developer\\TeachMeSkills\\Java\\Project\\9\\lesson9task2\\out\\production\\lesson9task2\\line.txt");
        FileWriter fw2 = new FileWriter("C:\\work_folder\\Android_developer\\TeachMeSkills\\Java\\Project\\9\\lesson9task2\\out\\production\\lesson9task2\\line2.txt");
        Scanner in = new Scanner(fr2);

        String str = in.nextLine();
        String[] str2 = str.split("\\. "); //по предложениям

        String str3 = str.replace(".", ""); // без точек
        String[] str4 = str3.split(" "); // по словам

        for (int i = 0; i < str2.length; i++) {
            TextFormater textFormater = null;
            if (TextFormater.wordCount(str2[i]) <= 5 && TextFormater.wordCount(str2[i]) >= 3) {
                fw2.write(str2[i]);
                fw2.write("\n");
            }
        }

        for (int j = 0; j < str4.length; j++) {
            TextFormater textFormater;
            if (TextFormater.isPalindrome(str4[j]) && str4[j].length() > 1) {
                fw2.write(str4[j]); // todo - нужно вывести предложение, в котором есть полиндром
                fw2.write("\n");
            }
        }
        fr2.close();
        fw2.close();
    }
}
