package chapter6;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_14_EstimatePI {

    public static void main(String[] args) {

        System.out.println("i\t\tπ");

        for (int i = 1; i < 1000; i += 100) {
            System.out.printf("%3d\t\t%.4f\n", i, getEstimatedPI(i));
        }
    }

    public static double getEstimatedPI(int n) {

        double piSeries = 0.0;
        double dividend;

        for (int i = 1; i <= n; i++) {
            dividend = Math.pow(-1, i % 2 + 1);
            piSeries += dividend / (2 * i - 1);
        }

        return 4 * piSeries;

    }


}
