package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/22/16.
 */
public class Ex5_18_Dsiplay4PatternsUsingLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int numOfLines = input.nextInt();

        System.out.println("Pattern A\t\t\t" +
                "Pattern B\t\t\t" +
                "Pattern C\t\t\t" +
                "Pattern D");
        for (int k = 1; k <= numOfLines; k++) {

            // Pattern A
            for (int l = 1; l <= k; l++) {
                System.out.printf("%d ", l);
            }
            for (int l = (numOfLines - 1); l >= k; l--) {
                System.out.printf("  ");
            }

            System.out.print("\t\t");


            // Pattern B
            for (int l = 1; l <= (numOfLines-k+1); l++) {
                System.out.printf("%d ", l);
            }

            for (int l = 1; l < k; l++) {
                System.out.printf("  ");
            }

            System.out.print("\t\t");


            // Pattern C
            for (int l = (numOfLines - 1); l >= k; l--) {
                System.out.printf("  ");
            }

            for (int l = k; l >= 1; l--) {
                System.out.printf("%d ", l);
            }

            System.out.print("\t\t");


            // Pattern D
            for (int l = 1; l < k; l++) {
                System.out.print("  ");
            }

            for (int l = 1; l <= (numOfLines - k + 1); l++) {
                System.out.printf("%d ", l);

            }

            System.out.println();
        }
    }

}
