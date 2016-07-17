package chapter6;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_13_SumSeries {

    public static void main(String[] args) {

        // display header
        System.out.println(" i\t\tm(i)");
        System.out.println("---------------");

        // display table body
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%2d\t\t%.4f\n", i, sumOfMSeries(i));
        }

    }

    public static double sumOfMSeries(int n) {

        double sum = 0.0;

        for (int i = n; i > 0; i--) {
            sum += i / (i + 1.0);
        }

        return sum;

    }
}
