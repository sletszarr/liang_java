package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/21/16.
 */

public class Eg5_11_DecimalToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        String hex = "";

        while (decimal != 0) {
            int hexVal = decimal % 16;

            char hexDigit = (hexVal >= 0 && hexVal <= 9) ?
                    (char) (hexVal + '0') : (char) (hexVal + 55);

            hex = hexDigit + hex;

            decimal /= 16;
        }

        System.out.println("The hex is " + hex);

    }
}