package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/19/16.
 */

public class Eg4_4_HexDigitToDecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        // Check if the hex string has exactly 1 character
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        char ch = hexString.charAt(0);
        if (ch >= 'A' && ch <= 'F') {
            int decVal = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " + ch + " is " + decVal);
        }
        else if (Character.isDigit(ch)) {
            System.out.println("The decimal value for hex digit " + ch + " is " + ch);
        }
        else {
            System.out.println(ch + " is an invalid input");
        }

    }
}
