package chapter5;

import javax.xml.transform.SourceLocator;

/**
 * Created by bnamora on 6/22/16.
 */
public class Eg5_15_DisplayPrimeNumbers {

    public static void main(String[] args) {

        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PERLINE = 10;
        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are: ");

        while (count < NUMBER_OF_PRIMES) {

            boolean isPrime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                if (count % NUMBER_OF_PRIMES_PERLINE == 0) {
                    System.out.println();
                }

                System.out.printf("%3d ", number);

                count++;

            }

            number++;

        }

    }
}
