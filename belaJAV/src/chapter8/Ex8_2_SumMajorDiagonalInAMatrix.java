package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/12/2016.
 */
public class Ex8_2_SumMajorDiagonalInAMatrix {

    public static void main(String[] args) {

        double[][] matrix = readMatrix();
        System.out.println("Sum of the elements " +
                "in the major diagonal is " +
                sumMajorDiagonal(matrix));

    }

    public static double[][] readMatrix(){
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[4][4];

        // get and initialize matrix value from user
        System.out.println("Enter a 4-by-4 matrix row by row");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextDouble();
            }
        }

        return matrix;
    }

    public static double sumMajorDiagonal(double[][] matrix) {
        double sumMD = 0;
        for(int row =0;row<matrix.length;row++) {
            sumMD += matrix[row][row];
        }
        return sumMD;
    }

}
