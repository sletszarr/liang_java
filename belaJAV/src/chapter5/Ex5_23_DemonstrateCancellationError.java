package chapter5;

/**
 * Created by bnamora on 6/27/16.
 */

public class Ex5_23_DemonstrateCancellationError {

    public static void main(String[] args) {

        int n = 50000;

        // summation of series from left
        double summationFromLeft = 0.0;

        for (int i = 1; i <= n; i++) {
            summationFromLeft += 1.0 / i;
        }
        System.out.println("Summation from left: " + summationFromLeft);

        //summation of series from right
        double summationFromRight = 0.0;

        for (int i = n; i > 0; i--) {
            summationFromRight += 1.0 / i;
        }
        System.out.println("Summation from right: " + summationFromRight);


    }
}
