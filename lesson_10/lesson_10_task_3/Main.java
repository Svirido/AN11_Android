import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Person<String> person1 = new Person<>("Charley");
        Person<String> person2 = new Person<>("Bob");
        Person<String> person3 = new Person<>("Jack");

        // а) Создать динамический массив (ArrayList), содержащий объекты класса Person.
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(person1.getName());
        list1.add(person2.getName());
        list1.add(person3.getName());

        // б) Распечатать его содержимое используя foreach.
        for (String person : list1) {
            System.out.println(person);
        }

        // в) Изменить имя второго Person.
        list1.set(1, "Mason");

        // г) Создать нового Person и проверить есть ли такой Person в коллекции
        Person<String> person4 = new Person<>("Ethan");
        boolean check = false;
        for (String i : list1) {
            if (Objects.equals(i, person4.getName())) {
                check = true;
            }
        }
        System.out.println("Есть ли в коллекции " + person4 + " - " + check);

        // д) Удалить последний Person.
        list1.remove(list1.size() - 1);

        // е) Удалить все ящики.
        list1.clear();
    }
}
