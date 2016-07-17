package chapter6;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_10_DisplayPrimes {

    public static void main(String[] args) {

        final int PRIMES_PER_LINE = 20;
        int primeCount = 0;

        for (int i = 2; i < 10000; i++) {
            if (Eg6_7_PrimeNumberMethod.isPrimeNumber(i)) {
                System.out.printf("%5d", i);

                if (++primeCount % PRIMES_PER_LINE == 0) {
                    System.out.println();
                }
            }
        }

    }
}
