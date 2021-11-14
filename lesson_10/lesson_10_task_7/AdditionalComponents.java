public class AdditionalComponents implements  Foundation{

    private Foundation foundation;
    private int price;
    private String component;

    public AdditionalComponents(Foundation foundation, int price, String component){
        this.foundation = foundation;
        this.price = price;
        this.component = component;
    }

    @Override
    public int getPrice() {
        return this.price + foundation.getPrice();
    }

    @Override
    public String getComponent() {
        return this.component + foundation.getComponent();
    }
}
