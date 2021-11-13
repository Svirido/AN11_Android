import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        HeavyBox<String, Integer> box1 = new HeavyBox<>("2L", 120);
        HeavyBox<String, Integer> box2 = new HeavyBox<>("5L", 80);
        HeavyBox<String, Integer> box3 = new HeavyBox<>("1L", 90);
        HeavyBox<String, Integer> box4 = new HeavyBox<>("4L", 155);
        HeavyBox<String, Integer> box5 = new HeavyBox<>("3L", 165);

        TreeSet<Integer> collection = new TreeSet<>();
        collection.add(box1.getWeight());
        collection.add(box2.getWeight());
        collection.add(box3.getWeight());
        collection.add(box4.getWeight());
        collection.add(box5.getWeight());

        for (Integer box : collection){
            System.out.println(box);
        }
    }
}
