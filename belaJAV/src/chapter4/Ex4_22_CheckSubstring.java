package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/21/16.
 */

public class Ex4_22_CheckSubstring {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String firstString = input.nextLine();

        System.out.print("Enter string s2: ");
        String secondString = input.nextLine();

        if (firstString.contains(secondString)) {
            System.out.println(secondString + " is a substring of " + firstString);
        }
        else {
            System.out.println(secondString + " is not a substring of " + firstString);
        }

    }
}
