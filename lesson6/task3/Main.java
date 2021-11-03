import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        enum colors {black (0, 0, 0), blue(0, 191, 255), red(255, 0, 0), yellow(255, 255, 0);

            private final int R;
            private final int G;
            private final int B;

            colors(int R, int G, int B){
                this.R = R;
                this.G = G;
                this.B = B;
            }

            public int getR(){
                return R;
            }

            public int getG(){
                return G;
            }

            public int getB() {
                return B;
            }
        }

        System.out.println("Colors: " + Arrays.toString(colors.values()));
        System.out.println("Color: " + colors.black + " R = " + colors.black.R + " G = " + colors.black.R + " B = " + colors.black.B);
        System.out.println("Color: " + colors.blue + " R = " + colors.blue.R + " G = " + colors.blue.R + " B = " + colors.blue.B);
        System.out.println("Color: " + colors.red + " R = " + colors.red.R + " G = " + colors.red.R + " B = " + colors.red.B);
        System.out.println("Color: " + colors.yellow + " R = " + colors.yellow.R + " G = " + colors.yellow.R + " B = " + colors.yellow.B);



    }
}
