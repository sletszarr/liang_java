package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 */

public class Ex2_6_SumOfIntDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int firstDigit = number / 100;
        int secondDigit = (number % 100) / 10;
        int thirdDigit = (number % 10);
        int sumOfDigits = firstDigit + secondDigit + thirdDigit;

        System.out.println("The sum of the digits is " + sumOfDigits);

    }

}