package chapter6;

import java.util.Scanner;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_6_DisplayPatterns {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int numOfLines = input.nextInt();

        displayPattern(numOfLines);

    }

    public static void displayPattern(int numOfLines) {

        for (int k = 1; k <= numOfLines; k++) {

            // print spaces
            for (int l = 0; l < numOfLines - k; l++) {
                System.out.print("    ");
            }

            // print num
            for (int l = k; l > 0; l--) {
                System.out.printf("%-4d", l);
            }

            System.out.println();

        }
    }


}
