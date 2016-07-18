package chapter8;

/**
 * Created by bnamora on 7/18/16.
 */

public class Ex8_22_EvenNumberOf1s {

    public static void main(String[] args) {

        // get 6 by 6 matrix
        // with random 0s and 1s
        int[][] matrix = getMatrix();

        // display matrix
        displayMatrix(matrix);

        // scan for even number of 1s
        scanEvenNumberOf1s(matrix);

    }

    public static int[][] getMatrix() {
        int[][] matrix = new int[6][6];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (int) (Math.random() * 2);
            }
        }

        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    public static void scanEvenNumberOf1s(int[][] matrix) {
        scanRows(matrix);
        scanCols(matrix);
    }

    public static void scanRows(int[][] matrix) {
        int count;
        for (int row = 0; row < matrix.length; row++) {
            count = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                System.out.println("Even number of 1s in row #" + row);
            }
        }
    }

    public static void scanCols(int[][] matrix) {
        int count;
        for (int col = 0; col < matrix[0].length; col++) {
            count = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                System.out.println("Even number of 1s in col #" + col);
            }
        }
    }
}
