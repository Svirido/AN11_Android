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
        FileWriter fw = new FileWriter("C:\\work_folder\\Android_developer\\TeachMeSkills\\Java\\Project\\9\\lesson9task1\\out\\production\\lesson9task1\\line.txt");
        String text = "казак \nмыло \nкино \nдоход \nрадар \nфизика \nпотоп \nмашина";
        fw.write(text);
        fw.close();
    }

    public static void input2() throws IOException {
        FileReader fr2 = new FileReader("C:\\work_folder\\Android_developer\\TeachMeSkills\\Java\\Project\\9\\lesson9task1\\out\\production\\lesson9task1\\line.txt");
        FileWriter fw2 = new FileWriter("C:\\work_folder\\Android_developer\\TeachMeSkills\\Java\\Project\\9\\lesson9task1\\out\\production\\lesson9task1\\line2.txt");
        Scanner in = new Scanner(fr2);

        for (int i = 1; in.hasNext(); i++) {
            String str = in.next();
            if (isPalindrome(str)) {
                fw2.write(str);
                fw2.write("\n");
            }
        }
        fr2.close();
        fw2.close();
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}

