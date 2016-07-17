package chapter6;

import java.util.Scanner;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_21_PhoneKeypads {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println(getNumString(s));

    }

    public static String getNumString(String s) {

        String numString = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                numString += s.charAt(i);
            }
            else if (Character.isLetter(s.charAt(i))) {
                numString += getNumber(Character.toUpperCase(s.charAt(i)));
            }
            else {
                continue;

            }

        }

        return numString;
    }

    public static int getNumber(char upperCaseLetter) {

        if (upperCaseLetter >= 'A' && upperCaseLetter <= 'C') {
            return 2;
        }
        else if (upperCaseLetter >= 'D' && upperCaseLetter <= 'F') {
            return 3;
        }
        else if (upperCaseLetter >= 'G' && upperCaseLetter <= 'I') {
            return 4;
        }
        else if (upperCaseLetter >= 'J' && upperCaseLetter <= 'L') {
            return 5;
        }
        else if (upperCaseLetter >= 'M' && upperCaseLetter <= 'O') {
            return 6;
        }
        else if (upperCaseLetter >= 'P' && upperCaseLetter <= 'S') {
            return 7;
        }
        else if (upperCaseLetter >= 'T' && upperCaseLetter <= 'V') {
            return 8;
        }
        else {
            return 9;
        }

    }
}
