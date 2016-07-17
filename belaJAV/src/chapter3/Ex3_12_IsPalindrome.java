package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/15/16.
 */

public class Ex3_12_IsPalindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int num = input.nextInt();

        int firstDigit = num / 100;
        int lastDigit = num % 10;

        boolean isPalindrome = (firstDigit == lastDigit);

        if (isPalindrome) {
            System.out.println(num + " is a palindrome");
        }
        else {
            System.out.println(num + " is not a palindrome");
        }

    }
}
