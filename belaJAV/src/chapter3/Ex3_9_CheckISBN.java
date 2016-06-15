package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/15/16.
 */

public class Ex3_9_CheckISBN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int intISBN = input.nextInt();

        int d9 = intISBN % 10;
        intISBN /= 10;

        int d8 = intISBN % 10;
        intISBN /= 10;

        int d7 = intISBN % 10;
        intISBN /= 10;

        int d6 = intISBN % 10;
        intISBN /= 10;

        int d5 = intISBN % 10;
        intISBN /= 10;

        int d4 = intISBN % 10;
        intISBN /= 10;

        int d3 = intISBN % 10;
        intISBN /= 10;

        int d2 = intISBN % 10;
        intISBN /= 10;

        int d1 = intISBN;

        int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
        System.out.print((checksum == 10) ? "X" : +checksum);
    }
}
