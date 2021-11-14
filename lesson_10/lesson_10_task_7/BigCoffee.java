public class BigCoffee implements  Foundation{

    private int price;
    private String componenet;

    public BigCoffee (int price, String componenet){
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
