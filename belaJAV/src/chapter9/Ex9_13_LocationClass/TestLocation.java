package chapter9.Ex9_13_LocationClass;

import java.util.Scanner;

/**
 * Created by bnamora on 7/22/16.
 */

public class TestLocation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get number of row
        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();

        // get number of col
        System.out.print("Enter the number of cols: ");
        int col = input.nextInt();

        // get array
        double[][] a = new double[row][col];
        System.out.println("Enter the array");
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[i].length; k++) {
                a[i][k] = input.nextDouble();
            }
        }

        // get location
        Location loc = Location.locateLargest(a);

        // display result
        System.out.printf("The location of the largest element " +
                "[%.1f] is (%d, %d)", loc.maxValue, loc.row, loc.col);

    }

}
