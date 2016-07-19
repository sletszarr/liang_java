package chapter8;

import java.util.Scanner;

/**
 * Created by bnamora on 7/19/16.
 */

public class Ex8_23_FindFlippedCell {

    public static void main(String[] args) {

        // get matrix from user
        int[][] matrix = getMatrix();

        // get the first violating row/col
        int r = getTheFirstViolatingRow(matrix);
        int c = getTheFirstViolatingCol(matrix);

        // display flipped cell
        displayFlippedCell(r, c);

    }

    public static int[][] getMatrix() {

        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[6][6];

        System.out.println("Enter a 6-by-6 matrix row by row");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextInt();
            }
        }

        return matrix;

    }

    public static int getTheFirstViolatingRow(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            int counter = 0;

            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == 1) {
                    counter++;
                }
            }

            if (counter % 2 != 0) {
                return row;
            }
        }

        return -1;
    }

    public static int getTheFirstViolatingCol(int[][] matrix) {

        for (int col = 0; col < matrix[0].length; col++) {
            int counter = 0;

            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 1) {
                    counter++;
                }
            }

            if (counter % 2 != 0) {
                return col;
            }
        }

        return -1;
    }


    public static void displayFlippedCell(int r, int c) {

        if (r == -1) {
            System.out.println("There are no violating row");
        } else if (c == -1) {
            System.out.println("There are no violating column");
        }

        System.out.printf("The flipped cell is at (%d, %d)", r, c);

    }
}
