package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/21/16.
 */

public class Eg5_9_GreatestCommonDivisor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNum = input.nextInt();

        boolean bothNumIsEven = (firstNum % 2 == 0 && secondNum % 2 == 0);

        int gcd = 1;
        int k = 2;

        while (k <= firstNum && k <= secondNum) {
            if (firstNum % k == 0 && secondNum % k == 0) {
                gcd = k;
            }
            if (bothNumIsEven) {
                k += 2;
            } else {
                k++;
            }
        }

        System.out.println("The greatest common divisor for " +
                        firstNum + " and " + secondNum + " is " + gcd
        );

    }
}
