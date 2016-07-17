package chapter6;

import java.util.Scanner;

/**
 * Created by bnamora on 6/29/16.
 */

public class Eg6_8_HexToDecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hexNum = input.nextLine();

        if (isValidHexString(hexNum)) {
            System.out.println("The decimal value for hex number " +
                    hexNum + " is " + hexToDec(hexNum));
        }
        else {
            System.out.println("Your input is not a valid hex.");
            System.exit(1);
        }

    }

    public static int hexToDec(String hexString) {

        int decVal = 0;
        int hexLength = hexString.length();
        char hexChar;

        for (int i = 0; i < hexLength; i++) {
            hexChar = hexString.charAt(i);
            decVal = decVal * 16 + getDigitFromHexChar(hexChar);
        }

        return decVal;

    }

    public static int getDigitFromHexChar(char hexChar) {

        hexChar = Character.toUpperCase(hexChar);

        if (hexChar >= 'A' && hexChar <= 'F') {
            return 10 + hexChar - 'A';
        } else {
            return hexChar - '0';
        }


    }

    public static boolean isValidHexString(String hexString) {

        for (int i = 0; i < hexString.length(); i++) {
            if (!isValidHexChar(hexString.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static boolean isValidHexChar(char ch) {

        return ((ch >= 'a' && ch <= 'f')
                || (ch >= 'A' && ch <= 'F')
                || (ch >= '0' && ch <= '9'));

    }
}
