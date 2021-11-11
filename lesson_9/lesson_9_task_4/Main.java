import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        final File outputStream = new File("C:\\work_folder\\Android_developer\\TeachMeSkills\\Java\\Project\\9\\lesson9task4\\out\\production\\lesson9task4\\save.txt");

        final ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream(outputStream));
        Car car1 = new Car("Reno", 120, 8000);
        objectOutput.writeObject(car1);
        objectOutput.close();

        final ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(outputStream));
        Car car2 = (Car) objectInput.readObject();
        System.out.println(car2);

    }
}
