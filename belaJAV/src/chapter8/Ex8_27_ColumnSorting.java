package chapter8;

import java.util.Scanner;

/**
 * Created by bnamora on 7/19/16.
 */

public class Ex8_27_ColumnSorting {

    public static void main(String[] args) {

        // get matrix from user
        double[][] matrix = getMatrix();

        // display sorted-column matrix
        System.out.println("\nThe column-sorted array is:");
        displayMatrix(sortColumns(matrix));

    }

    public static double[][] getMatrix() {

        Scanner input = new Scanner(System.in);

        double[][] m = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix:");
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                m[row][col] = input.nextDouble();
            }
        }

        return m;
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double col : row)
                System.out.printf("%.3f ", col);
            System.out.println();
        }
    }

    public static double[][] sortColumns(double[][] m) {

        double[][] sortedCols = new double[m.length][m[0].length];

        for (int col = 0; col < m[0].length; col++) {

            // create holder for nums in #col
            double[] arrayOfCols = new double[m.length];

            // copy m[row][#col] to arrayOfCols
            for (int row = 0; row < m.length; row++) {
                arrayOfCols[row] = m[row][col];
            }

            // sort array of cols
            sort(arrayOfCols);

            // copy arrayOfCols to sortedCols[row][#col]
            for (int row = 0; row < m.length; row++) {
                sortedCols[row][col] = arrayOfCols[row];
            }
        }

        return sortedCols;

    }

    public static void sort(double[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;

            for (int k = i + 1; k < nums.length; k++) {
                if (nums[k] < nums[minIndex]) {
                    minIndex = k;
                }
            }

            if (minIndex != i) {
                double temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }

    }
}
