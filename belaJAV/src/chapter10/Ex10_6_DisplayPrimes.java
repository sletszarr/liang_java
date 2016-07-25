package chapter10;

import mylib.StackOfIntegers;

import java.util.Scanner;

/**
 * Created by bnamora on 7/24/16.
 */

public class Ex10_6_DisplayPrimes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get maximum number
        System.out.print("Enter the maximum number: ");
        int maxNum = input.nextInt();

        // find & display primes
        displayPrimes(findPrimes(maxNum));

    }

    public static StackOfIntegers findPrimes(int maxNum) {

        StackOfIntegers primes = new StackOfIntegers();
        primes.push(2);

        for (int num = 3; num <= maxNum; num++) {
            if (isPrime(num))
                primes.push(num);
        }

        return primes;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void displayPrimes(StackOfIntegers primes) {
        while (!primes.isEmpty()) {
            System.out.print(primes.pop() + " ");
        }
    }
}
