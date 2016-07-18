package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/16/2016.
 */

public class Ex8_19_ConsecutiveFour {

    public static void main(String[] args) {

        int[][] array = getArray();

        scanConsecutiveFour(array);

    }

    public static int[][] getArray() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of cols: ");
        int cols = input.nextInt();

        int[][] array = new int[rows][cols];

        System.out.printf("Enter the %d by %d array\n", rows, cols);
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = input.nextInt();
            }
        }

        return array;
    }

    // scanning rows
    public static void scanConsecutiveRow(int[][] array) {

        for (int row = 0; row < array.length; row++) {

            int consecutiveCount = 0;
            int consecutiveNum = 0;

            for (int col = 0; col < array[row].length - 1; col++) {
                if (array[row][col] == array[row][col + 1]) {
                    consecutiveCount++;
                    consecutiveNum = array[row][col];
                } else {
                    consecutiveCount = 0;
                }

                if (consecutiveCount == 3) {
                    System.out.printf("four consecutive %d in row %d" +
                                    " from col %d to %d\n",
                            consecutiveNum, row, col - 2, col + 1);
                    break;
                }
            }
        }

    }

    // scanning cols
    public static void scanConsecutiveCol(int[][] array) {

        for (int col = 0; col < array[0].length; col++) {

            int consecutiveCount = 0;
            int consecutiveNum = 0;

            for (int row = 0; row < array.length - 1; row++) {
                if (array[row][col] == array[row + 1][col]) {
                    consecutiveCount++;
                    consecutiveNum = array[row][col];
                } else {
                    consecutiveCount = 0;
                }

                if (consecutiveCount == 3) {
                    System.out.printf("four consecutive %d in col %d " +
                                    "from row %d to row %d\n",
                            consecutiveNum, col, row - 2, row + 1);
                    break;
                }
            }

        }

    }

    // scanning diagonals
    public static void scanConsecutiveDiagonal(int[][] array) {

        int startingRow;

        // scanning left to right diagonal
        startingRow = array.length - 4;
        for (int startingCol = 0; startingCol <= array[0].length - 4; startingCol++) {
            while (startingRow != 0) {
                scanLTR(startingRow, startingCol, array);
                startingRow--;
            }
            scanLTR(startingRow, startingCol, array);
        }

        // scanning right to left diagonal
        startingRow = array.length - 4;
        for (int startingCol = array[0].length - 1; startingCol >= 3; startingCol--) {
            while (startingRow != 0) {
                scanRTL(startingRow, startingCol, array);
                startingRow--;
            }
            scanRTL(startingRow, startingCol, array);
        }

    }

    public static void scanLTR(int startingRow, int startingCol, int[][] array) {

        int consecutiveCount = 0;
        int consecutiveNum = 0;

        for (int row = startingRow, col = startingCol;
             row < array.length - 1 && col < array[0].length - 1;
             row++, col++) {

            if (array[row][col] == array[row + 1][col + 1]) {
                consecutiveCount++;
                consecutiveNum = array[row][col];
            } else {
                consecutiveCount = 0;
            }

            if (consecutiveCount == 3) {
                System.out.printf("four consecutive %d from (%d, %d) " +
                                "to (%d, %d)\n", consecutiveNum,
                        row - 2, col - 2, row + 1, col + 1);
                break;
            }
        }

    }

    public static void scanRTL(int startingRow, int startingCol, int[][] array) {

        int consecutiveCount = 0;
        int consecutiveNum = 0;

        for (int row = startingRow, col = startingCol;
             row < array.length - 1 && col > 0;
             row++, col--) {

            if (array[row][col] == array[row + 1][col - 1]) {
                consecutiveCount++;
                consecutiveNum = array[row][col];
            } else {
                consecutiveCount = 0;
            }

            if (consecutiveCount == 3) {
                System.out.printf("four consecutive %d from (%d, %d) " +
                                "to (%d, %d)\n", consecutiveNum,
                        row - 2, col + 2, row + 1, col - 1);
                break;
            }

        }

    }

    public static void scanConsecutiveFour(int[][] array) {

        scanConsecutiveRow(array);
        scanConsecutiveCol(array);
        scanConsecutiveDiagonal(array);

    }

}
