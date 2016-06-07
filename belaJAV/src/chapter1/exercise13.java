package chapter1;

/**
 * Created by bnamora on 6/8/16.
 */
public class exercise13 {

    public static void main(String[] args) {

        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = .55;
        double e = 44.5;
        double f = 5.9;

        System.out.println("3.4x + 50.25y = 44.5");
        System.out.println("2.1x + .55y = 5.9");
        System.out.println("x = " + (e * d - b * f) / (a * d - b * c));
        System.out.println("y = " + (a * f - e * c) / (a * d - b * c));

    }
}
