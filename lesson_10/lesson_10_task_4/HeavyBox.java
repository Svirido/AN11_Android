public class HeavyBox<T, B> implements Comparable {

    T id;
    B weight;

    HeavyBox(T id, B weight) {
        this.id = id;
        this.weight = weight;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public B getWeight(){
        return weight;
    }

    public void setWeight(B weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "Id = " + id + " weight = " + weight;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
