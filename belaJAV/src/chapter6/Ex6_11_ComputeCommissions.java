package chapter6;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_11_ComputeCommissions {

    public static void main(String[] args) {

        System.out.println("Sales Amount\tCommission");

        for (int i = 10000; i <= 100000; i += 5000) {
            System.out.printf("\t%6d\t\t%.1f\n", i, computeCommission(i));
        }

    }

    public static double computeCommission(double salesAmount) {

        if (salesAmount <= 5000) {
            return 0.08 * salesAmount;
        }
        else if (salesAmount <= 10000) {
            return 0.08 * 5000 + 0.1 * (salesAmount - 5000);
        }
        else {
            return 0.08 * 5000 + 0.1 * 5000 + 0.12 * (salesAmount - 10000);
        }

    }
}
