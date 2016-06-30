package chapter6;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_22_ApproximateSquareRoot {

    public static void main(String[] args) {

        System.out.println(sqrt(4));

    }

    public static double sqrt(long n) {

        final double EPSILON = 1E-9;
        double sqrtApproximate = 1;
        double lastGuess;

        do {
            lastGuess = sqrtApproximate;
            sqrtApproximate = (sqrtApproximate + n / sqrtApproximate) / 2;

        } while (Math.abs(sqrtApproximate-lastGuess) >= EPSILON);


        return sqrtApproximate;
    }
}
