package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/29/16.
 */

public class Ex5_47_CheckISBN13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get the first 12 digits
        System.out.print("Enter the first 12 digits" +
                "of an ISBN-13 as a string: ");
        String first12Digits = input.nextLine();

        // validate input length
        if (first12Digits.length() != 12) {
            System.out.println(first12Digits + " is an invalid input");
            System.exit(1);
        }

        // calculate the checksum series
        int sumSeries = 0;

        for (int i = 0; i < first12Digits.length(); i++) {
            sumSeries += Integer.parseInt(Character.toString(first12Digits.charAt(i)));
            i++;
            sumSeries += 3 * Integer.parseInt(Character.toString(first12Digits.charAt(i)));
        }

        // calculate checksum and the last digit
        int checksum = 10 - sumSeries % 10;
        int lastDigit = (checksum == 10) ? 10 : checksum;

        // display result
        System.out.println("The ISBN-13 number is " + first12Digits + lastDigit);

    }
}
