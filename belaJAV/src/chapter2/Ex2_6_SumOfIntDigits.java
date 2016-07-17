package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 *
 * (Sum the digits in an integer)
 * Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
 * For example, if an integer is 932, the sum of all its digits is 14.
 *
 * Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit.
 * For instance, 932 % 10 = 2 and 932 / 10 = 93.
 *
 */

public class Ex2_6_SumOfIntDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int thirdDigit = number % 10;
        number /= 10;

        int secondDigit = number % 10;
        number /= 10;

        int firstDigit = number;

        int sumOfDigits = firstDigit + secondDigit + thirdDigit;

        System.out.println("The sum of the digits is " + sumOfDigits);

    }

}