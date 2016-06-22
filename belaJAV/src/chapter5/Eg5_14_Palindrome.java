package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/22/16.
 */

public class Eg5_14_Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        boolean isPalindrome = true;
        int leftBound = 0;
        int rightBound = inputString.length() - 1;

        while (isPalindrome && leftBound < rightBound) {
            isPalindrome = (isPalindrome &&
                    (inputString.charAt(leftBound) == inputString.charAt(rightBound)));
            leftBound++;
            rightBound--;
        }

        if (isPalindrome) {
            System.out.println(inputString + " is a palindrome");
        }
        else {
            System.out.println(inputString + " is not a palindrome");
        }
    }
}
