package chapter6;

import java.util.Scanner;

/**
 * Created by bnamora on 6/29/16.
 */

public class Eg6_6_GreatestCommonDivisor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNum = input.nextInt();
        System.out.print("Enter the second integer: ");
        int secondNum = input.nextInt();

        System.out.println("The greatest common divisor" +
                "for " + firstNum + " and " + secondNum + " is " +
                gcd(firstNum, secondNum));

    }

    public static int gcd(int n1, int n2) {

        int gcd = 1;    // initial gcd
        int k = 2;      // possible gcd

        // find the minimum number
        int min = Math.min(n1, n2);

        // find gcd
        while (k <= min / 2) {

            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }

            k++;

        }

        return gcd;

    }
}
