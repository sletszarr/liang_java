package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/20/16.
 */

public class Ex4_12_HexToBinary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        // make sure the input is only 1 character
        if (hexString.length() == 1) {
            char hexVal = hexString.charAt(0);
            int hexDigit = 0;

            // get the decimal value
            if (Character.isDigit(hexVal)) {
                hexDigit = Character.getNumericValue(hexVal);
            } else if (hexVal >= 'A' && hexVal <= 'F') {
                hexDigit = hexVal - 55;
            } else {
                System.out.println(hexVal + " is an invalid input");
                System.exit(1);
            }

            // converting from decimal to binary
            String binaryVal = "";

            binaryVal = hexDigit % 2 + binaryVal;
            hexDigit /= 2;

            binaryVal = hexDigit % 2 + binaryVal;
            hexDigit /= 2;

            binaryVal = hexDigit % 2 + binaryVal;
            hexDigit /= 2;

            binaryVal = hexDigit + binaryVal;

            System.out.println(binaryVal);

        }
        else {
            System.out.println("You can only enter 1 character");
            System.exit(1);
        }

    }

}