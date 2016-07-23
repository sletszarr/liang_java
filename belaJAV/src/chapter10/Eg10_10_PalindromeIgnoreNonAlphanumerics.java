package chapter10;

import java.util.Scanner;

/**
 * Created by bnamora on 7/23/16.
 */

public class Eg10_10_PalindromeIgnoreNonAlphanumerics {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.printf("is %s a palindrome? %b", s, isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {

        // get a new string
        // with alphanumeric chars only
        String s1 = filter(s);

        // get a reversed of s1
        String s2 = reverse(s1);

        return s1.equals(s2);

    }

    public static String filter(String s) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                s1.append(s.charAt(i));
            }
        }
        System.out.println("Ignoring alphanumeric characters..");

        return s1.toString();
    }

    public static String reverse(String s) {
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        return s1.toString();
    }

}
