package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/20/16.
 */

public class Ex4_19_CheckISBN10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN: ");
        String ISBN = input.nextLine();

        // make sure the user enters 9 characters
        if (ISBN.length() == 9) {
            int d1 = Character.getNumericValue(ISBN.charAt(0));
            int d2 = Character.getNumericValue(ISBN.charAt(1));
            int d3 = Character.getNumericValue(ISBN.charAt(2));
            int d4 = Character.getNumericValue(ISBN.charAt(3));
            int d5 = Character.getNumericValue(ISBN.charAt(4));
            int d6 = Character.getNumericValue(ISBN.charAt(5));
            int d7 = Character.getNumericValue(ISBN.charAt(6));
            int d8 = Character.getNumericValue(ISBN.charAt(7));
            int d9 = Character.getNumericValue(ISBN.charAt(8));

            // calculating checksum for the 10th ISBN char
            int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 +
                    d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

            // display result
            System.out.print("The ISBN-10 number is " +
                    d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
            System.out.print((checksum == 10) ? "X" : checksum);

        }
        else {
            System.out.println("You must input the first 9 ISBN Characters");
            System.exit(1);
        }

    }

}
