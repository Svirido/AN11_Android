public class SmallCoffee implements  Foundation{

    private int price;
    private String componenet;

    public SmallCoffee(int price, String componenet){
        this.price = price;
        this.componenet = componenet;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getComponent() {
        return this.componenet;
    }
}
