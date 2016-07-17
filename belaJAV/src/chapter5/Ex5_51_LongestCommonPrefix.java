package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/29/16.
 */

public class Ex5_51_LongestCommonPrefix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get 2 strings from user
        System.out.print("Enter the first string: ");
        String firstString = input.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = input.nextLine();

        // initialize common prefix holder
        String commonPrefix = "";

        // find the shortest string
        int minStringLength = Math.min(firstString.length(), secondString.length());

        // find the longest common prefix
        for (int i = 0; i < minStringLength; i++) {
            if (firstString.charAt(i) == secondString.charAt(i)) {
                commonPrefix += firstString.charAt(i);
            }
            else {
                break;
            }
        }

        // display result
        if (commonPrefix.length() == 0) {
            System.out.println(firstString + " and " + secondString + " has no common prefix");
        }
        else {
            System.out.println("The common prefix is " + commonPrefix);
        }

    }
}
