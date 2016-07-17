package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/28/16.
 */

public class Ex5_36_CheckingISBN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get the first 9 digits
        System.out.print("Enter the first 9 digits of an ISBN integer: ");
        int first9ISBN = input.nextInt();
        int modISBN = first9ISBN;

        // calculate checksum for the 10th digit
        int checksum = 0;
        for (int i = 9; i > 0; i--) {
            checksum += i * (modISBN % 10);
            modISBN /= 10;
        }
        checksum %= 11;

        // display result
        System.out.print("The ISBN-10 number is: " + first9ISBN);
        System.out.print((checksum == 10) ? "X" : checksum);

    }
}
