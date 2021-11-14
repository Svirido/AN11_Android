import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();
        set1.add("Noah");
        set1.add("Mason");
        set1.add("Jacob");

        HashSet<String> set2 = new HashSet<>();
        set2.add("William");
        set2.add("Jacob");
        set2.add("Ethan");

        HashSet<String> setUnion = new HashSet<>();
        union(set1, set2, setUnion);
        System.out.println("Объединение: " + setUnion);

        HashSet<String> setIntersect = new HashSet<>();
        intersect(set1, set2, setIntersect);
        System.out.println("Пересечение: " + setIntersect);
    }

    public static Set<String> union(Set<String> set1, Set<String> set2, Set<String> setUnion) {
        setUnion.addAll(set1);
        setUnion.addAll(set2);
        return setUnion;
    }

    public static Set<String> intersect(Set<String> set1, Set<String> set2, Set<String> setIntersect) {
        for (String s : set1) {
            if (set2.contains(s)) {
                setIntersect.add(s);
            }
        }
        return setIntersect;
    }
}
