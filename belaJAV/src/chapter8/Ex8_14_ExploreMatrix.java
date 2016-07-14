package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/14/2016.
 */

public class Ex8_14_ExploreMatrix {

    public static void main(String[] args) {

        // get matrix
        int[][] matrix = getMatrix();

        // display matrix
        displayMatrix(matrix);

        // explore matrix
        exploreMatrix(matrix);

    }

    public static int[][] getMatrix() {

        Scanner input = new Scanner(System.in);

        // get matrix's size
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();

        // prepare matrix
        int[][] matrix = new int[size][size];

        // fill with random 0s and 1s
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (int) (Math.random() * 2);
            }
        }

        // return
        return matrix;

    }

    public static void displayMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    public static void exploreMatrix(int[][] matrix) {
        exploreRows(matrix);
        exploreColumns(matrix);
        exploreMajorDiagonal(matrix);
        exploreSubDiagonal(matrix);
    }

    public static void exploreRows(int[][] matrix) {

        boolean hasSameNumbers = false;

        for (int row = 0; row < matrix.length; row++) {
            boolean allOnes = true;
            boolean allZeroes = true;

            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 1) {
                    allZeroes = false;
                }
                if (matrix[row][col] == 0) {
                    allOnes = false;
                }
            }
            System.out.print((allOnes) ? "All 1s on row " + row + "\n" : "");
            System.out.print((allZeroes) ? "All 0s on row " + row + "\n" : "");

            if (allOnes || allZeroes) {
                hasSameNumbers = true;
            }
        }

        if (!hasSameNumbers) {
            System.out.println("No same numbers on a row");
        }

    }

    public static void exploreColumns(int[][] matrix) {

        boolean hasSameNumbers = false;

        for (int col = 0; col < matrix[0].length; col++) {
            boolean allOnes = true;
            boolean allZeroes = true;

            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 1) {
                    allZeroes = false;
                }
                if (matrix[row][col] == 0) {
                    allOnes = false;
                }
            }

            System.out.print((allOnes) ? "All 1s on column " + col + "\n" : "");
            System.out.print((allZeroes) ? "All 0s on column " + col + "\n" : "");

            if (allOnes || allZeroes) {
                hasSameNumbers = true;
            }
        }

        if (!hasSameNumbers) {
            System.out.println("No same numbers on a column");
        }

    }

    public static void exploreMajorDiagonal(int[][] matrix) {

        boolean hasSameNumbers = false;
        boolean allOnes = true;
        boolean allZeroes = true;

        for (int i = 0; i < matrix[0].length; i++) {

            if (matrix[i][i] == 0) {
                allOnes = false;
            }
            if (matrix[i][i] == 1) {
                allZeroes = false;
            }
        }

        System.out.print((allOnes) ? "All 1s on the major diagonal\n" : "");
        System.out.print((allZeroes) ? "All 0s on the major diagonal\n" : "");

        hasSameNumbers = allOnes || allZeroes;

        if (!hasSameNumbers) {
            System.out.println("No same numbers on the major diagonal");
        }

    }

    public static void exploreSubDiagonal(int[][] matrix) {

        boolean hasSameNumbers = false;
        boolean allOnes = true;
        boolean allZeroes = true;

        for (int i = 0, k = matrix.length - 1;
             i < matrix[0].length && k >= 0; i++, k--) {

            if (matrix[i][k] == 0) {
                allOnes = false;
            }
            if (matrix[i][k] == 1) {
                allZeroes = false;
            }

        }

        System.out.print((allOnes) ? "All 1s on the sub-diagonal\n" : "");
        System.out.print((allZeroes) ? "All 0s on the sub-diagonal\n" : "");

        hasSameNumbers = allOnes || allZeroes;

        if (!hasSameNumbers) {
            System.out.println("No same numbers on the sub-diagonal");
        }

    }
}
