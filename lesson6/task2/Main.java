public class Main {
    public static void main(String[] args) {

        Greeter spain = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Oye");
            }
        };

        Greeter english = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Hello!");
            }
        };

        Greeter german = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Hallo!");
            }
        };

        Greeter french = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Hey!");
            }
        };
        spain.wish();
        english.wish();
        german.wish();
        french.wish();
    }
}
