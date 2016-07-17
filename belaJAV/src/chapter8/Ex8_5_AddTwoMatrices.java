package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/12/2016.
 */

public class Ex8_5_AddTwoMatrices {

    public static void main(String[] args) {

        double[][] matrixA = readMatrix(3, 1);
        double[][] matrixB = readMatrix(3, 2);
        double[][] sum = addMatrix(matrixA, matrixB);
        showMattrixAddition(matrixA, matrixB, sum);

    }

    public static double[][] readMatrix(int length, int nth) {
        double[][] matrix = new double[length][length];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix#" + nth + ": ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextDouble();
            }
        }

        return matrix;
    }

    public static double[][] addMatrix(double[][] m1, double[][] m2) {
        double[][] sum = new double[m1.length][m1[0].length];

        for (int i = 0; i < sum.length; i++) {
            for (int k = 0; k < sum[i].length; k++) {
                sum[i][k] = m1[i][k] + m2[i][k];
            }
        }

        return sum;
    }

    public static void showMattrixAddition(
            double[][] m1, double[][] m2, double[][] sum) {
        System.out.println("The matrices are added as follow:");
        for (int i = 0; i < sum.length; i++) {
            for (int k = 0; k < sum[i].length; k++)
                System.out.printf("%5.1f ", m1[i][k]);

            System.out.print((i == sum.length/2) ? "  +  " : "     ");

            for (int k = 0; k < sum[i].length; k++)
                System.out.printf("%5.1f ", m2[i][k]);

            System.out.print((i == sum.length/2) ? "  =  " : "     ");

            for (int k = 0; k < sum[i].length; k++)
                System.out.printf("%5.1f ", sum[i][k]);

            System.out.println();
        }
    }
}
