package chapter8;

import java.util.Scanner;

/**
 * Created by bnamora on 7/19/16.
 */

public class Ex8_29_IdenticalArrays {

    public static void main(String[] args) {

        // get matrix from user
        int[][] m1 = getMatrix(1);
        int[][] m2 = getMatrix(2);

        // display whether the 2 matrix
        // are identical
        System.out.println("The two arrays are " +
                ((isEqual(m1, m2) ? "" : "not ")) +
                "identical");

    }

    public static int[][] getMatrix(int nth) {

        Scanner input = new Scanner(System.in);

        int[][] m = new int[3][3];

        System.out.print("Enter list #" + nth + ": ");
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                m[row][col] = input.nextInt();
            }
        }

        return m;
    }

    public static boolean isEqual(int[][] m1, int[][] m2) {

        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[row].length; col++) {
                if (!isFoundOn(m1[row][col], m2)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isFoundOn(int num, int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (num == matrix[row][col]) {
                    matrix[row][col] = -1;
                    return true;
                }
            }
        }

        return false;
    }
}
