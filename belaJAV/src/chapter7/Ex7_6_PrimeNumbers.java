package chapter7;

/**
 * Created by Acer-756 on 7/4/2016.
 */

public class Ex7_6_PrimeNumbers {

    public static void main(String[] args) {

        // create prime array
        int[] primes = new int[100000];

        // assign 2 as the first prime
        primes[0] = 2;
        int primeCount = 1;
        int num = 3;

        // print the first 50 primes
        while (primeCount < 100000) {
            if (isPrime(primes, num))
                primes[primeCount++] = num;

            num++;
        }

        // display result
        printPrime(primes);

    }

    // check whether num is a prime
    public static boolean isPrime(int[] primes, int num) {

        for (int prime : primes) {
            if (prime > Math.sqrt(num)) break;
            if (num % prime == 0) return false;
        }

        return true;
    }

    // print prime array
    public static void printPrime(int[] primes) {
        for (int i = 0; i < primes.length; i++) {
            System.out.printf("%10d", primes[i]);

            // print 10 primes per line
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

}
