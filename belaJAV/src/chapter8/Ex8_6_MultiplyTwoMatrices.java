package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/12/2016.
 */

public class Ex8_6_MultiplyTwoMatrices {

    public static void main(String[] args) {

        double[][] matrix1 = readMatrix(3, 1);
        double[][] matrix2 = readMatrix(3, 2);
        double[][] multiplied = multiplyMatrix(matrix1, matrix2);
        displayMultiplication(matrix1, matrix2, multiplied);

    }

    public static double[][] readMatrix(int length, int nth) {
        double[][] matrix = new double[length][length];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix #" + nth + ": ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextDouble();
            }
        }

        return matrix;
    }

    public static double[][] multiplyMatrix(double[][] m1, double[][] m2) {
        double[][] multiplied = new double[m1.length][m1.length];
        for (int i = 0; i < multiplied.length; i++) {
            for (int k = 0; k < multiplied[i].length; k++) {
                multiplied[i][k] = 0;
                for (int m = 0; m < multiplied.length; m++) {
                    multiplied[i][k] += m1[i][m] * m2[m][k];
                }
            }
        }
        return multiplied;
    }

    public static void displayMultiplication(
            double[][] m1, double[][] m2, double[][] multiplied) {

        System.out.println("The multiplication of matrices is ");

        for (int i = 0; i < multiplied.length; i++) {
            for (int k = 0; k < multiplied[i].length; k++)
                System.out.printf("%5.1f ", m1[i][k]);

            System.out.print(
                    (i == multiplied.length / 2) ? "  x  " : "     ");

            for (int k = 0; k < multiplied[i].length; k++)
                System.out.printf("%5.1f ", m2[i][k]);

            System.out.print(
                    (i == multiplied.length / 2) ? "  =  " : "     ");

            for (int k = 0; k < multiplied[i].length; k++)
                System.out.printf("%5.1f ", multiplied[i][k]);

            System.out.println();
        }
    }

}
