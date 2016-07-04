package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/4/2016.
 */

public class Ex7_14_GreatestCommonDivisor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The greatest common divisor is " +
                gcd(numbers));

    }

    public static int gcd(int... numbers) {

        int gcdCandidate = min(numbers);
        boolean candidatePassed;

        while (gcdCandidate > 1) {
            candidatePassed = true;

            // test gcd candidate to all numbers
            for (int number : numbers) {
                if (number % gcdCandidate != 0) {
                    candidatePassed = false;
                    break;
                }
            }

            if (candidatePassed) {
                return gcdCandidate;
            } else {
                gcdCandidate--;
            }
        }

        return 1;

    }

    public static int min(int... numbers) {
        int min = numbers[0];

        for (int number: numbers) {
            if (number < min) {
                min = number;
            }
        }

        return min;
    }

}
