package chapter8;

import java.util.Scanner;

/**
 * Created by bnamora on 7/19/16.
 */

public class Ex8_25_MarkovMatrix {

    public static void main(String[] args) {

        // get matrix from user
        double[][] matrix = getMatrix();

        // display whether it's a markov matrix
        System.out.println("It is " +
                ((isMarkovMatrix(matrix) ? "" : "not ")) +
                "a markov matrix");

    }

    public static double[][] getMatrix() {

        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++)
                matrix[row][col] = input.nextDouble();
        }


        return matrix;
    }

    public static boolean isMarkovMatrix(double[][] matrix) {
        return hasNoNegativeValue(matrix) && sumOfEachColumnIs1(matrix);
    }

    public static boolean hasNoNegativeValue(double[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < 0)
                    return false;
            }
        }

        return true;
    }

    public static boolean sumOfEachColumnIs1(double[][] matrix) {

        for (int col = 0; col < matrix[0].length; col++) {
            double sum = 0;

            for (int row = 0; row < matrix.length; row++)
                sum += matrix[row][col];

            if (sum != 1)
                return false;
        }

        return true;
    }

}
