package chapter8;

/**
 * Created by Acer-756 on 7/14/2016.
 */

public class Ex8_10_LargestRowCol {

    public static void main(String[] args) {

        int[][] matrix = getMatrix();
        displayMatrix(matrix);
        System.out.println("The largest row index: " +
                getLargestRowIndex(matrix));
        System.out.println("The largest column index: " +
                getLargestColumnIndex(matrix));

    }

    public static int[][] getMatrix() {
        int[][] matrix = new int[4][4];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++)
                matrix[row][col] = (int) (Math.random() * 2);
        }

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

    public static int getLargestRowIndex(int[][] matrix) {
        int largestRowIndex = 0;
        int maxOnes = 0;

        for (int row = 0; row < matrix.length; row++) {
            int oneCounter = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] == 1)
                    oneCounter++;
            }
            if (oneCounter > maxOnes) {
                largestRowIndex = row;
                maxOnes = oneCounter;
            }
        }

        return largestRowIndex;
    }

    public static int getLargestColumnIndex(int[][] matrix) {
        int largestColIndex = 0;
        int maxOnes = 0;

        for (int col = 0; col < matrix[0].length; col++) {
            int oneCounter = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 1)
                    oneCounter++;
            }
            if (oneCounter > maxOnes) {
                largestColIndex = col;
                maxOnes = oneCounter;
            }
        }

        return largestColIndex;
    }
}
