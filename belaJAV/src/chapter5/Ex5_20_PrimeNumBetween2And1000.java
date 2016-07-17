package chapter5;

/**
 * Created by bnamora on 6/22/16.
 */

public class Ex5_20_PrimeNumBetween2And1000 {

    public static void main(String[] args) {


        final int NUMBERS_PER_LINE = 8;
        int primeCount = 0;

        // running number from 2 - 1000
        for (int k = 2; k < 1000; k++) {

            boolean isPrime = true;

            // checking if k is not a prime
            for (int l = 2; l < k / 2; l++) {
                if (k % l == 0) {
                    isPrime = false;
                    break;
                }
            }

            // if k is prime, display result
            if (isPrime) {
                System.out.printf("%3d ", k);
                primeCount++;

                // line break every 8 chars
                if (primeCount % NUMBERS_PER_LINE == 0) {
                    System.out.println();
                }
            }
        }
    }
}
