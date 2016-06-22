package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/22/16.
 */

public class Ex5_14_GreatestCommonDivisor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int gcd = 0;

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        for (int d = Math.min(num1, num2); d >= 1; d--) {
            if (num1 % d == 0 && num2 % d == 0) {
                gcd = d;
                break;
            }
        }

        System.out.printf("The greatest common divisor between %d and %d is %d", num1, num2, gcd);
    }
}
