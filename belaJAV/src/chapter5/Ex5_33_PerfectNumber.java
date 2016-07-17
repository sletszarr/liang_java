package chapter5;

/**
 * Created by bnamora on 6/28/16.
 */

public class Ex5_33_PerfectNumber {

    public static void main(String[] args) {

        int sumOfDivisor;

        for (int num = 2; num < 10000; num++) {

            sumOfDivisor = 1;

            // find all num's positive divisor
            for (int divisor = 2; divisor <= num / 2; divisor++) {
                if (num % divisor == 0) {
                    // if found, sum it
                    sumOfDivisor += divisor;
                }
            }

            // check if num is a perfect number
            if (num == sumOfDivisor) {
                // if it is, print to console
                System.out.print(num + " ");
            }

        }

    }
}
