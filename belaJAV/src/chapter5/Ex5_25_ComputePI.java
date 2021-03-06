package chapter5;

/**
 * Created by bnamora on 6/27/16.
 */

public class Ex5_25_ComputePI {

    public static void main(String[] args) {

        System.out.println("iterations\t\t π value");

        double sumOfPISeries;

        // iteration's step
        for (int k = 10000; k <= 100000; k += 10000) {
            sumOfPISeries = 0.0;

            // sum of pi series in k iterations
            for (int l = k; l > 0; l--) {
                sumOfPISeries -= 1.0 / (2.0 * l - 1);
                l--;
                sumOfPISeries += 1.0 / (2.0 * l - 1);
            }

            // π value
            double PI = 4 * sumOfPISeries;

            System.out.printf("%6d\t\t\t%.10f", k, PI);
            System.out.println();
        }

    }
}
