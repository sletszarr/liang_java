package chapter6;

/**
 * Created by bnamora on 6/29/16.
 */

public class Eg6_7_PrimeNumberMethod {

    public static void main(String[] args) {

        System.out.println("The first 50 prime numbers are: ");
        printPrimeNumbers(50);

    }

    public static void printPrimeNumbers(int numOfPrimes) {

        final int NUMBERS_OF_PRIMES_PER_LINE = 10;

        // count the number of primes
        int count = 0;

        // initial prime number
        int number = 2;

        while (count < numOfPrimes) {

            if (isPrimeNumber(number)) {
                System.out.printf("%-5s", number);
                count++;

                if (count % NUMBERS_OF_PRIMES_PER_LINE == 0) {
                    System.out.println();
                }
            }


            number++;
        }

    }

    public static boolean isPrimeNumber(int primeCandidate) {

        for (int divisor = 2; divisor <= primeCandidate / 2; divisor++) {
            if (primeCandidate % divisor == 0) {
                return false;
            }
        }

        return true;

    }
}
