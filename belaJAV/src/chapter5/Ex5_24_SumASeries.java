package chapter5;

/**
 * Created by bnamora on 6/27/16.
 */

public class Ex5_24_SumASeries {

    public static void main(String[] args) {

        double dividend = 97;
        double divisor = 99;

        double sumOfSeries = 0.0;

        while (dividend >= 1 && divisor >= 3) {
            sumOfSeries += dividend / divisor;
            dividend -= 2;
            divisor -= 2;
        }

        System.out.println("The sum of the series is " + sumOfSeries);

    }
}
