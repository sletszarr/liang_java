package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/20/16.
 */

public class Ex4_20_ProcessAString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // prompt user to enter a string
        System.out.print("Enter a string: ");
        String userString = input.nextLine();

        // display length and the first character
        System.out.println(userString + "'s length is " + userString.length());
        System.out.println("with "+userString.charAt(0)+" as the first character");

    }
}
