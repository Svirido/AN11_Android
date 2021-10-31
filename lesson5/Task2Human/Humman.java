public class Humman implements Jacket, Pants, Shoes {
    public static void main(String[] args) {
    }

    private final Humman name;
    private final Jacket jacket;
    private final Pants pants;
    private final Shoes shoes;


    public Humman(Humman name, Jacket jacket, Pants pants, Shoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    @Override
    public void putOn() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void takeOff(){
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }


}
