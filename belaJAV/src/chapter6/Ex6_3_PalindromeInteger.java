package chapter6;

import java.util.Scanner;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_3_PalindromeInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        System.out.println("The number you entered is " +
                        ((isPalindrome(num)) ? "a palindrome." :
                                "not a palindrome")
        );

    }

    public static int reverse(int number) {

        String reversedNum = "";

        while (number > 0) {
            reversedNum += number % 10;
            number /= 10;
        }

        return Integer.parseInt(reversedNum);

    }

    public static boolean isPalindrome(int number) {

        return (number == reverse(number));

    }

}
