public class Person <T> {

    private T name;

    Person(T name){
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: " + name;
    }
}
