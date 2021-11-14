public class Main {
    public static void main(String[] args) {

        // Маленький стакан кофе + молоко + корица
        Foundation cofe1 = new SmallCoffee(50, " Маленький стакан");
        Foundation milk = new Milk(cofe1);
        Foundation cinamom = new Cinnamon(milk);
        System.out.println(cinamom.getComponent());
        System.out.println(cinamom.getPrice());

        // Большой стакан кофе + молоко + корица + сироп
        Foundation cofe2 = new BigCoffee(80, " Большой стакан");
        Foundation milk2 = new Milk(cofe2);
        Foundation cinamo2 = new Cinnamon(milk2);
        Foundation syrup2 = new Syrup(cinamo2);
        System.out.println(syrup2.getComponent());
        System.out.println(syrup2.getPrice());

    }
}
