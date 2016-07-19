package chapter8;

import java.util.Scanner;

/**
 * Created by bnamora on 7/19/16.
 */

public class Ex8_26_RowSorting {

    public static void main(String[] args) {

        // get matrix
        double[][] matrix = getMatrix();

        // display sorted-row matrix
        System.out.println("\nThe row-sorted array is");
        displayMatrix(sortRows(matrix));
    }

    public static double[][] getMatrix() {

        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextDouble();
            }
        }

        return matrix;
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double col : row) {
                System.out.printf("%.3f ", col);
            }
            System.out.println();
        }
    }

    public static double[][] sortRows(double[][] matrix) {

        double[][] sortedRows = new double[matrix.length][matrix[0].length];

        // make a copy of matrix
        for (int row = 0; row < sortedRows.length; row++) {
            for (int col = 0; col < sortedRows[row].length; col++) {
                sortedRows[row][col] = matrix[row][col];
            }
        }

        // sort row
        for (int row = 0; row < sortedRows.length; row++) {
            sort(sortedRows[row]);
        }

        return sortedRows;
    }

    public static void sort(double[] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            int minIndex = i;

            for (int k = i + 1; k < matrix.length; k++) {
                if (matrix[k] < matrix[minIndex]) {
                    minIndex = k;
                }
            }

            if (minIndex != i) {
                double temp = matrix[i];
                matrix[i] = matrix[minIndex];
                matrix[minIndex] = temp;
            }
        }
    }

}










































