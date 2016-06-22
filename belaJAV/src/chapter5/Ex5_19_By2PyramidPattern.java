package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/22/16.
 */

public class Ex5_19_By2PyramidPattern {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int numOfLines = input.nextInt();

        for (int k = 1; k <= numOfLines; k++) {

            for (int l = numOfLines; l > k; l--) {
                System.out.print("    ");
            }
            for (int l = 1; l <= Math.pow(2, k - 1); l *= 2) {
                System.out.printf("%3d ", l);
            }
            for (int l = (int) Math.pow(2, k - 2); l >= 1; l /= 2) {
                System.out.printf("%3d ", l);
            }

            System.out.println();
        }
    }
}
