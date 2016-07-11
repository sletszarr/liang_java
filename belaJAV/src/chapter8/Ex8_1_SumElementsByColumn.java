package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/12/2016.
 */

public class Ex8_1_SumElementsByColumn {

    public static void main(String[] args) {

        double[][] matrix = readMatrix();
        displaySumByColumn(matrix);

    }

    public static double[][] readMatrix() {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];

        // get and initialize matrix value from user
        System.out.println("Enter a 3-by-4 matrix row by row");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextDouble();
            }
        }

        return matrix;
    }

    public static void displaySumByColumn(double[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            double sumByCol = 0;
            for (int row = 0; row < matrix.length; row++) {
                sumByCol += matrix[row][col];
            }
            System.out.println("Sum of the element at " +
                    "column " + col + " is " + sumByCol);
        }
    }
}
