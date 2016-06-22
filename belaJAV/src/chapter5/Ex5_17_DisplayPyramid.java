package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/22/16.
 */

public class Ex5_17_DisplayPyramid {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int numOfLines = input.nextInt();

        for (int i = 1; i <= numOfLines; i++) {
            for (int j = (numOfLines - i); j > 0; j--) {
                System.out.print("    ");
            }

            for (int j = i; j > 0; j--) {
                System.out.printf("  %2d", j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.printf("  %2d", j);
            }

            System.out.println();
        }

    }
}
